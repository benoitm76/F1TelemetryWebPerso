package fr.frizby.f1telemetrywebstat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Logger;

import fr.frizby.f1telemetrywebstat.Utils.F1Data;
import fr.frizby.f1telemetrywebstat.Utils.Log;
import fr.frizby.f1telemetrywebstat.Utils.Utils;

public class Main {
	private DatagramSocket localDatagramSocket;
	private boolean closureInProgress = false; 
	private F1Data curData;
	
	private Lap lastLap = new Lap();
	private Lap curLap = new Lap();
	private F1Data lastLapInfo;	
	
	public static void main(String[] args) {
		Log.getInstance();
		new Main();
	}
	
	public Main() {
		Log.c("Application startup : F1 Telemetry");
		Log.c("Version : " + getClass().getPackage().getImplementationVersion());
		Log.c("Author : Vincent DRON");
		Log.c("Based on : F1TelemetryOnRpi from Benoit MOUQUET (https://github.com/benoitm76/F1TelemetryOnRpi)");

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
			Log.i("Ready for receiving packets...");
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
						Log.i("No data there, adding first data...");
						curLap.getLapInfo().add(curData);
					}
					else
					{
						lastLapInfo = curLap.getLapInfo().get(curLap.getLapInfo().size() - 1);
						double dif = curData.getTime() - lastLapInfo.getTime();

						if(dif >= 0.001 || dif <= -0.001)
						{
							if(curData.getLap() > lastLapInfo.getLap() && curData.getLapTime() < lastLapInfo.getLapTime())
							{
	
								Log.i("Detecting new lap, ");
								
								if(!lastLap.getLapInfo().isEmpty())
								{
									Log.i("sending lastLap info, ");
									
									lastLap.sendData();
								}
								Log.i("saving this lap, creating the new one...");
								if(curLap.getLapInfo().get(0).getLapTime() < 1.0)
								{
									lastLap = curLap.clone();
								}
								curLap = new Lap();
							}
							else if(curData.getLap() < lastLapInfo.getLap() && curData.getLapTime() > lastLapInfo.getLapTime())
							{
								Log.e("Rewind to the past lap, delete data from this point...");
								
								lastLap.removeLapInfoFromTime(lastLapInfo.getTime());
								curLap = lastLap;
								lastLap = new Lap();
							}
							else if(curData.getLapTime() < lastLapInfo.getLapTime())
							{
								Log.e("Rewind during the lap, delete data from this point...");
								
								curLap.removeLapInfoFromTime(curData.getLapTime());
							}
							
							curLap.getLapInfo().add(curData);
						}
					}
					
				} catch (Exception e) {
					// Display error message only if we not leave the
					// application
					if (!closureInProgress) {
						Log.wtf(e.getMessage());
					}
				}
			}

		} catch (SocketException localSocketException1) {
			Log.wtf("Cannot create socket. Are you trying to run two instances listening to the same port?");
			System.exit(1);
		}
	}

}
