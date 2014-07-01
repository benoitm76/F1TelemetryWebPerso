package fr.frizby.f1telemetrywebstat;

import java.util.ArrayList;

import fr.frizby.f1telemetrywebstat.Utils.F1Data;
import fr.frizby.f1telemetrywebstat.Utils.MySQLDB;

public class Lap implements Cloneable {
	private ArrayList<F1Data> lapInfo;
	private double averageSpeed = 0;
	private double fuelConsuption = 0;
	private double kersConsuption = 0;
	private double drsTime = 0;
	
	
	public ArrayList<F1Data> getLapInfo() {
		return lapInfo;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public double getFuelConsuption() {
		return fuelConsuption;
	}

	public double getKersConsuption() {
		return kersConsuption;
	}

	public double getDrsTime() {
		return drsTime;
	}

	public void setLapInfo(ArrayList<F1Data> lapInfo) {
		this.lapInfo = lapInfo;
	}	

	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public void setFuelConsuption(double fuelConsuption) {
		this.fuelConsuption = fuelConsuption;
	}

	public void setKersConsuption(double kersConsuption) {
		this.kersConsuption = kersConsuption;
	}

	public void setDrsTime(double drsTime) {
		this.drsTime = drsTime;
	}

	public Lap() {
		lapInfo = new ArrayList<F1Data>();
	}
	
	public void removeLapInfoFromTime(double lapTime)
	{
		int i = 0;
		for(F1Data d : lapInfo)
		{
			if(d.getLapTime() >= lapTime)
			{
				lapInfo.remove(i);
			}
			else
			{
				i++;
			}
		}
	}
	
	public boolean sendData()
	{
		MySQLDB cnx = new MySQLDB();
		
		ArrayList<Double> arg = new ArrayList<Double>();
		arg.add(this.averageSpeed);
		arg.add(this.fuelConsuption);
		arg.add(this.kersConsuption);
		arg.add(this.drsTime);
		if(cnx.createLap(arg) != 0)
		{
			System.out.println("TRUE");
			return true;
		}
		else
			return false;
	}
	
	public Lap clone()
	{
		Lap lap = null;
    	try {
      		lap = (Lap) super.clone();
    	} catch(CloneNotSupportedException cnse) {
      		cnse.printStackTrace(System.err);
	    }
	    return lap;
	}
	
	public String toString()
	{
		String output = "";
		for(F1Data d : getLapInfo())
		{
			output += "\nTime : " + d.getTime()
					+ "\nLapTime : " + d.getLapTime()
					+ "\nLapDistance : " + d.getLapDistance()
					+ "\nDistance : " + d.getDistance()
					+ "\nPosX : " + d.getPosX()
					+ "\nPosY : " + d.getPosY()
					+ "\nPosZ : " + d.getPosZ()
					+ "\nSpeed : " + d.getSpeed()
					+ "\nPosXV : " + d.getPosXV()
					+ "\nPosYV : " + d.getPosYV()
					+ "\nPosZV : " + d.getPosZV()
					+ "\nPosXR : " + d.getPosXR()
					+ "\nRoll : " + d.getRoll()
					+ "\nPosZR : " + d.getPosZR()
					+ "\nPosXD : " + d.getPosXD()
					+ "\nPitch : " + d.getPitch()
					+ "\nPosZD : " + d.getPosZD()
					+ "\nSuspensionPositionRL : " + d.getSuspensionPositionRL()
					+ "\nSuspensionPositionRR : " + d.getSuspensionPositionRR()
					+ "\nSuspensionPositionFL : " + d.getSuspensionPositionFL()
					+ "\nSuspensionPositionFR : " + d.getSuspensionPositionFR()
					+ "\nSuspensionVelocityRL : " + d.getSuspensionVelocityRL()
					+ "\nSuspensionVelocityRR : " + d.getSuspensionVelocityRR()
					+ "\nSuspensionVelocityFL : " + d.getSuspensionVelocityFL()
					+ "\nSuspensionVelocityFR : " + d.getSuspensionVelocityFR()
					+ "\nWheelSpeedRL : " + d.getWheelSpeedRL()
					+ "\nWheelSpeedRR : " + d.getWheelSpeedRR()
					+ "\nWheelSpeedFL : " + d.getWheelSpeedFL()
					+ "\nWheelSpeedFR : " + d.getWheelSpeedFR()
					+ "\nThrottle : " + d.getThrottle()
					+ "\nSteer : " + d.getSteer()
					+ "\nBrake : " + d.getBrake()
					+ "\nClutch : " + d.getClutch()
					+ "\nGear : " + d.getGear()
					+ "\nGForceLatitudinal : " + d.getgForceLatitudinal()
					+ "\nGForceLongitudinal : " + d.getgForceLongitudinal()
					+ "\nLap : " + d.getLap()
					+ "\nEngineRpm : " + d.getEngineRpm()
					+ "\nNewField1 : " + d.getNewField1()
					+ "\nRacePosition : " + d.getRacePosition()
					+ "\nKersRemaining : " + d.getKersRemaining()
					+ "\nKersRecharge : " + d.getKersRecharge()
					+ "\nDrsStatus : " + d.getDrsStatus()
					+ "\nDifficulty : " + d.getDifficulty()
					+ "\nAssists : " + d.getAssists()
					+ "\nFuelRemaining : " + d.getFuelRemaining()
					+ "\nSessionType : " + d.getSessionType()
					+ "\nNewField10 : " + d.getNewField10()
					+ "\nSector : " + d.getSector()
					+ "\nTimeSector1 : " + d.getTimeSector1()
					+ "\nTimeSector2 : " + d.getTimeSector2()
					+ "\nBakeTemperatureRL : " + d.getBakeTemperatureRL()
					+ "\nBakeTemperatureRR : " + d.getBakeTemperatureRR()
					+ "\nBakeTemperatureFL : " + d.getBakeTemperatureFL()
					+ "\nBakeTemperatureFR : " + d.getBakeTemperatureFR()
					+ "\nNewField18 : " + d.getNewField18()
					+ "\nNewField19 : " + d.getNewField19()
					+ "\nNewField20 : " + d.getNewField20()
					+ "\nNewField21 : " + d.getNewField21()
					+ "\nCompletedLapsInRace : " + d.getCompletedLapsInRace()
					+ "\nTotalLapsInRace : " + d.getTotalLapsInRace()
					+ "\nPreviousLapTime : " + d.getPreviousLapTime()
					+ "\nNewField26 : " + d.getNewField26()
					+ "\nNewField27 : " + d.getNewField27();
					//+ "\nNewField28 : " + d.getNewField28();
		}
		return output;
	}

}
