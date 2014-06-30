package fr.frizby.f1telemetrywebstat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import fr.frizby.f1telemetrywebstat.Utils.F1Data;
import fr.frizby.f1telemetrywebstat.Utils.Utils;

public class Main {
	private DatagramSocket localDatagramSocket;
	private boolean closureInProgress = false; 
	private F1Data curData;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		System.out.println("Application startup : F1 Telemetry");
		System.out.println("Version : " + getClass().getPackage().getImplementationVersion());
		System.out.println("Author : Vincent DRON");
		System.out.println("Based on : F1TelemetryOnRpi from Benoit MOUQUET (https://github.com/benoitm76/F1TelemetryOnRpi)");

		curData = new F1Data();

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
					//curData.updateDataWithDoubleArray(datas);
					curData.updateDataWithConsoleExit(datas);
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
