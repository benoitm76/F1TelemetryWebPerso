package fr.frizby.f1telemetrywebstat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Logger;

import fr.frizby.f1telemetrywebstat.Utils.F1Data;
import fr.frizby.f1telemetrywebstat.Utils.Utils;

public class Main {
	private DatagramSocket localDatagramSocket;
	private boolean closureInProgress = false; 
	private F1Data curData;
	
	private Lap lastLap = new Lap();
	private Lap curLap = new Lap();
	private F1Data lastLapInfo;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		System.out.println("Application startup : F1 Telemetry");
		System.out.println("Version : " + getClass().getPackage().getImplementationVersion());
		System.out.println("Author : Vincent DRON");
		System.out.println("Based on : F1TelemetryOnRpi from Benoit MOUQUET (https://github.com/benoitm76/F1TelemetryOnRpi)");

		// Execute when leave application (ctrl + c)
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				// Notify that we close the application
				closureInProgress = true;
				// Close the socket if it is open
				if (localDatagramSocket != null
						&& !localDatagramSocket.isClosed()) {
					localDatagramSocket.close();
				}
			}
		});

		byte[] arrayOfByte = new byte[256];
		try {
			localDatagramSocket = new DatagramSocket(20777);
			System.out.println("Ok");
			// Infinity loop
			while (true) {
				DatagramPacket localDatagramPacket = new DatagramPacket(
						arrayOfByte, arrayOfByte.length);
				try {
					// Get datagram packet
					localDatagramSocket.receive(localDatagramPacket);
					// Get data
					byte[] localObject1 = localDatagramPacket.getData();
					// Extract double from data
					double[] datas = (double[]) Utils
							.byteToDouble(localObject1);

					// Update the F1 data object
					curData = new F1Data(datas);
					//curData.updateDataWithConsoleExit(datas);
										
					if(curLap.getLapInfo().isEmpty())
					{
						curLap.getLapInfo().add(curData);
					}
					else
					{
						lastLapInfo = curLap.getLapInfo().get(curLap.getLapInfo().size() - 1);
						
						if(curData.getLap() > lastLapInfo.getLap() && curData.getLapTime() < lastLapInfo.getLapTime())
						{
							//TODO Send lastLap;
							if(!lastLap.getLapInfo().isEmpty())
							{
								lastLap.sendData();
								F1Data finalInfos = lastLap.getLapInfo().get(lastLap.getLapInfo().size() -1);
								System.out.println("Lap :" + finalInfos.getLap() + " : " + finalInfos.getLapTime() + " seconds");
							}
							lastLap = curLap.clone();
							curLap = new Lap();
						}

						if(curData.getLap() < lastLapInfo.getLap() && curData.getLapTime() > lastLapInfo.getLapTime())
						{
							lastLap.removeLapInfoFromTime(lastLapInfo.getTime());
							curLap = lastLap;
							lastLap = new Lap();
						}
						
						curLap.getLapInfo().add(curData);
					}
					
				} catch (Exception e) {
					// Display error message only if we not leave the
					// application
					if (!closureInProgress) {
						e.printStackTrace();
					}
				}
			}

		} catch (SocketException localSocketException1) {
			System.err
					.println("Cannot create socket. Are you trying to run two instances listening to the same port?");
			System.exit(1);
		}
	}

}
