package fr.frizby.f1telemetrywebstat.Utils;

public class Utils {	
	public static String doubleToTime(double time) {
		int ms = (int) (time * 1000 % 1000);
		int s = (int) (time % 60);
		int min = (int) (time / 60);
		return min + ":" + String.format("%02d", s) + ":"
				+ String.format("%03d", ms);
	}

	public static double[] byteToDouble(byte[] paramArrayOfByte) {
		double[] arrayOfDouble = new double[paramArrayOfByte.length / 4];
		for (int i3 = 0; i3 < arrayOfDouble.length; i3++) {
			double d1 = Float.intBitsToFloat(paramArrayOfByte[(i3 << 2)] & 0xFF
					| (paramArrayOfByte[((i3 << 2) + 1)] & 0xFF) << 8
					| (paramArrayOfByte[((i3 << 2) + 2)] & 0xFF) << 16
					| (paramArrayOfByte[((i3 << 2) + 3)] & 0xFF) << 24);
			arrayOfDouble[i3] = d1;
		}
		return arrayOfDouble;
	}
}
