package fr.frizby.f1telemetrywebstat.Utils;

public class F1Data {
	private double time;
	private double lapTime;
	private double lapDistance;
	private double distance;
	private double posX;
	private double posY;
	private double posZ;
	private double speed;
	private double posXV;
	private double posYV;
	private double posZV;
	private double posXR;
	private double roll;
	private double posZR;
	private double posXD;
	private double pitch;
	private double posZD;
	private double suspensionPositionRL;
	private double suspensionPositionRR;
	private double suspensionPositionFL;
	private double suspensionPositionFR;
	private double suspensionVelocityRL;
	private double suspensionVelocityRR;
	private double suspensionVelocityFL;
	private double suspensionVelocityFR;
	private double wheelSpeedRL;
	private double wheelSpeedRR;
	private double wheelSpeedFL;
	private double wheelSpeedFR;
	private double throttle;
	private double steer;
	private double brake;
	private double clutch;
	private double gear;
	private double gForceLatitudinal;
	private double gForceLongitudinal;
	private double lap;
	private double engineRpm;
	
	private double newField1;
	private double racePosition;
	private double KersRemaining;
	private double kersRecharge;
	private double drsStatus;
	private double difficulty;
	private double assists;
	private double fuelRemaining;
	private double sessionType;
	private double newField10;
	private double sector;
	private double timeSector1;
	private double timeSector2;
	private double bakeTemperatureRL;
	private double bakeTemperatureRR;
	private double bakeTemperatureFL;
	private double bakeTemperatureFR;
	private double newField18;
	private double newField19;
	private double newField20;
	private double newField21;
	private double completedLapsInRace;
	private double totalLapsInRace;
	private double PreviousLapTime;
	private double newField26;
	private double newField27;
	private double newField28;

	public double getTime() {
		return time;
	}

	public double getLapTime() {
		return lapTime;
	}

	public double getLapDistance() {
		return lapDistance;
	}

	public double getDistance() {
		return distance;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public double getPosZ() {
		return posZ;
	}

	public double getSpeed() {
		return speed;
	}

	public double getPosXV() {
		return posXV;
	}

	public double getPosYV() {
		return posYV;
	}

	public double getPosZV() {
		return posZV;
	}

	public double getPosXR() {
		return posXR;
	}

	public double getRoll() {
		return roll;
	}

	public double getPosZR() {
		return posZR;
	}

	public double getPosXD() {
		return posXD;
	}

	public double getPitch() {
		return pitch;
	}

	public double getPosZD() {
		return posZD;
	}

	public double getSuspensionPositionRL() {
		return suspensionPositionRL;
	}

	public double getSuspensionPositionRR() {
		return suspensionPositionRR;
	}

	public double getSuspensionPositionFL() {
		return suspensionPositionFL;
	}

	public double getSuspensionPositionFR() {
		return suspensionPositionFR;
	}

	public double getSuspensionVelocityRL() {
		return suspensionVelocityRL;
	}

	public double getSuspensionVelocityRR() {
		return suspensionVelocityRR;
	}

	public double getSuspensionVelocityFL() {
		return suspensionVelocityFL;
	}

	public double getSuspensionVelocityFR() {
		return suspensionVelocityFR;
	}

	public double getWheelSpeedRL() {
		return wheelSpeedRL;
	}

	public double getWheelSpeedRR() {
		return wheelSpeedRR;
	}

	public double getWheelSpeedFL() {
		return wheelSpeedFL;
	}

	public double getWheelSpeedFR() {
		return wheelSpeedFR;
	}

	public double getThrottle() {
		return throttle;
	}

	public double getSteer() {
		return steer;
	}

	public double getBrake() {
		return brake;
	}

	public double getClutch() {
		return clutch;
	}

	public double getGear() {
		return gear;
	}

	public double getgForceLatitudinal() {
		return gForceLatitudinal;
	}

	public double getgForceLongitudinal() {
		return gForceLongitudinal;
	}

	public double getLap() {
		return lap;
	}

	public double getEngineRpm() {
		return engineRpm;
	}

	public double getNewField1() {
		return newField1;
	}

	public double getRacePosition() {
		return racePosition;
	}

	public double getKersRemaining() {
		return KersRemaining;
	}

	public double getKersRecharge() {
		return kersRecharge;
	}

	public double getDrsStatus() {
		return drsStatus;
	}

	public double getDifficulty() {
		return difficulty;
	}

	public double getAssists() {
		return assists;
	}

	public double getFuelRemaining() {
		return fuelRemaining;
	}

	public double getSessionType() {
		return sessionType;
	}

	public double getNewField10() {
		return newField10;
	}

	public double getSector() {
		return sector;
	}

	public double getTimeSector1() {
		return timeSector1;
	}

	public double getTimeSector2() {
		return timeSector2;
	}

	public double getBakeTemperatureRL() {
		return bakeTemperatureRL;
	}

	public double getBakeTemperatureRR() {
		return bakeTemperatureRR;
	}

	public double getBakeTemperatureFL() {
		return bakeTemperatureFL;
	}

	public double getBakeTemperatureFR() {
		return bakeTemperatureFR;
	}

	public double getNewField18() {
		return newField18;
	}

	public double getNewField19() {
		return newField19;
	}

	public double getNewField20() {
		return newField20;
	}

	public double getNewField21() {
		return newField21;
	}

	public double getCompletedLapsInRace() {
		return completedLapsInRace;
	}

	public double getTotalLapsInRace() {
		return totalLapsInRace;
	}

	public double getPreviousLapTime() {
		return PreviousLapTime;
	}

	public double getNewField26() {
		return newField26;
	}

	public double getNewField27() {
		return newField27;
	}

	public double getNewField28() {
		return newField28;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public void setLapTime(double lapTime) {
		this.lapTime = lapTime;
	}

	public void setLapDistance(double lapDistance) {
		this.lapDistance = lapDistance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public void setPosZ(double posZ) {
		this.posZ = posZ;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setPosXV(double posXV) {
		this.posXV = posXV;
	}

	public void setPosYV(double posYV) {
		this.posYV = posYV;
	}

	public void setPosZV(double posZV) {
		this.posZV = posZV;
	}

	public void setPosXR(double posXR) {
		this.posXR = posXR;
	}

	public void setRoll(double roll) {
		this.roll = roll;
	}

	public void setPosZR(double posZR) {
		this.posZR = posZR;
	}

	public void setPosXD(double posXD) {
		this.posXD = posXD;
	}

	public void setPitch(double pitch) {
		this.pitch = pitch;
	}

	public void setPosZD(double posZD) {
		this.posZD = posZD;
	}

	public void setSuspensionPositionRL(double suspensionPositionRL) {
		this.suspensionPositionRL = suspensionPositionRL;
	}

	public void setSuspensionPositionRR(double suspensionPositionRR) {
		this.suspensionPositionRR = suspensionPositionRR;
	}

	public void setSuspensionPositionFL(double suspensionPositionFL) {
		this.suspensionPositionFL = suspensionPositionFL;
	}

	public void setSuspensionPositionFR(double suspensionPositionFR) {
		this.suspensionPositionFR = suspensionPositionFR;
	}

	public void setSuspensionVelocityRL(double suspensionVelocityRL) {
		this.suspensionVelocityRL = suspensionVelocityRL;
	}

	public void setSuspensionVelocityRR(double suspensionVelocityRR) {
		this.suspensionVelocityRR = suspensionVelocityRR;
	}

	public void setSuspensionVelocityFL(double suspensionVelocityFL) {
		this.suspensionVelocityFL = suspensionVelocityFL;
	}

	public void setSuspensionVelocityFR(double suspensionVelocityFR) {
		this.suspensionVelocityFR = suspensionVelocityFR;
	}

	public void setWheelSpeedRL(double wheelSpeedRL) {
		this.wheelSpeedRL = wheelSpeedRL;
	}

	public void setWheelSpeedRR(double wheelSpeedRR) {
		this.wheelSpeedRR = wheelSpeedRR;
	}

	public void setWheelSpeedFL(double wheelSpeedFL) {
		this.wheelSpeedFL = wheelSpeedFL;
	}

	public void setWheelSpeedFR(double wheelSpeedFR) {
		this.wheelSpeedFR = wheelSpeedFR;
	}

	public void setThrottle(double throttle) {
		this.throttle = throttle;
	}

	public void setSteer(double steer) {
		this.steer = steer;
	}

	public void setBrake(double brake) {
		this.brake = brake;
	}

	public void setClutch(double clutch) {
		this.clutch = clutch;
	}

	public void setGear(double gear) {
		this.gear = gear;
	}

	public void setgForceLatitudinal(double gForceLatitudinal) {
		this.gForceLatitudinal = gForceLatitudinal;
	}

	public void setgForceLongitudinal(double gForceLongitudinal) {
		this.gForceLongitudinal = gForceLongitudinal;
	}

	public void setLap(double lap) {
		this.lap = lap;
	}

	public void setEngineRpm(double engineRpm) {
		this.engineRpm = engineRpm;
	}

	public void setNewField1(double newField1) {
		this.newField1 = newField1;
	}

	public void setRacePosition(double racePosition) {
		this.racePosition = racePosition;
	}

	public void setKersRemaining(double kersRemaining) {
		KersRemaining = kersRemaining;
	}

	public void setKersRecharge(double kersRecharge) {
		this.kersRecharge = kersRecharge;
	}

	public void setDrsStatus(double drsStatus) {
		this.drsStatus = drsStatus;
	}

	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}

	public void setAssists(double assists) {
		this.assists = assists;
	}

	public void setFuelRemaining(double fuelRemaining) {
		this.fuelRemaining = fuelRemaining;
	}

	public void setSessionType(double sessionType) {
		this.sessionType = sessionType;
	}

	public void setNewField10(double newField10) {
		this.newField10 = newField10;
	}

	public void setSector(double sector) {
		this.sector = sector;
	}

	public void setTimeSector1(double timeSector1) {
		this.timeSector1 = timeSector1;
	}

	public void setTimeSector2(double timeSector2) {
		this.timeSector2 = timeSector2;
	}

	public void setBakeTemperatureRL(double bakeTemperatureRL) {
		this.bakeTemperatureRL = bakeTemperatureRL;
	}

	public void setBakeTemperatureRR(double bakeTemperatureRR) {
		this.bakeTemperatureRR = bakeTemperatureRR;
	}

	public void setBakeTemperatureFL(double bakeTemperatureFL) {
		this.bakeTemperatureFL = bakeTemperatureFL;
	}

	public void setBakeTemperatureFR(double bakeTemperatureFR) {
		this.bakeTemperatureFR = bakeTemperatureFR;
	}

	public void setNewField18(double newField18) {
		this.newField18 = newField18;
	}

	public void setNewField19(double newField19) {
		this.newField19 = newField19;
	}

	public void setNewField20(double newField20) {
		this.newField20 = newField20;
	}

	public void setNewField21(double newField21) {
		this.newField21 = newField21;
	}

	public void setCompletedLapsInRace(double completedLapsInRace) {
		this.completedLapsInRace = completedLapsInRace;
	}

	public void setTotalLapsInRace(double totalLapsInRace) {
		this.totalLapsInRace = totalLapsInRace;
	}

	public void setPreviousLapTime(double previousLapTime) {
		PreviousLapTime = previousLapTime;
	}

	public void setNewField26(double newField26) {
		this.newField26 = newField26;
	}

	public void setNewField27(double newField27) {
		this.newField27 = newField27;
	}

	public void setNewField28(double newField28) {
		this.newField28 = newField28;
	}

	public F1Data(double[] arrayOfDouble)
	{

		setTime(arrayOfDouble[0]);
		setLapTime(arrayOfDouble[1]);
		setLapDistance(arrayOfDouble[2]);
		setDistance(arrayOfDouble[3]);
		setPosX(arrayOfDouble[4]);
		setPosY(arrayOfDouble[5]);
		setPosZ(arrayOfDouble[6]);
		setSpeed(arrayOfDouble[7]);
		setPosXV(arrayOfDouble[8]);
		setPosYV(arrayOfDouble[9]);
		setPosZV(arrayOfDouble[10]);
		setPosXR(arrayOfDouble[11]);
		setRoll(arrayOfDouble[12]);
		setPosZR(arrayOfDouble[13]);
		setPosXD(arrayOfDouble[14]);
		setPitch(arrayOfDouble[15]);
		setPosZD(arrayOfDouble[16]);
		setSuspensionPositionRL(arrayOfDouble[17]);
		setSuspensionPositionRR(arrayOfDouble[18]);
		setSuspensionPositionFL(arrayOfDouble[19]);
		setSuspensionPositionFR(arrayOfDouble[20]);
		setSuspensionVelocityRL(arrayOfDouble[21]);
		setSuspensionVelocityRR(arrayOfDouble[22]);
		setSuspensionVelocityFL(arrayOfDouble[23]);
		setSuspensionVelocityFR(arrayOfDouble[24]);
		setWheelSpeedRL(arrayOfDouble[25]);
		setWheelSpeedRR(arrayOfDouble[26]);
		setWheelSpeedFL(arrayOfDouble[27]);
		setWheelSpeedFR(arrayOfDouble[28]);
		setThrottle(arrayOfDouble[29]);
		setSteer(arrayOfDouble[30]);
		setBrake(arrayOfDouble[31]);
		setClutch(arrayOfDouble[32]);
		setGear(arrayOfDouble[33]);
		setgForceLatitudinal(arrayOfDouble[34]);
		setgForceLongitudinal(arrayOfDouble[35]);
		setLap(arrayOfDouble[36]);
		setEngineRpm(arrayOfDouble[37]);
		
		setNewField1(arrayOfDouble[38]);
		setRacePosition(arrayOfDouble[39]);
		setKersRemaining(arrayOfDouble[40]);
		setKersRecharge(arrayOfDouble[41]);
		setDrsStatus(arrayOfDouble[42]);
		setDifficulty(arrayOfDouble[43]);
		setAssists(arrayOfDouble[44]);
		setFuelRemaining(arrayOfDouble[45]);
		setSessionType(arrayOfDouble[46]);
		setNewField10(arrayOfDouble[47]);
		setSector(arrayOfDouble[48]);
		setTimeSector1(arrayOfDouble[49]);
		setTimeSector2(arrayOfDouble[50]);
		setBakeTemperatureRL(arrayOfDouble[51]);
		setBakeTemperatureRR(arrayOfDouble[52]);
		setBakeTemperatureFL(arrayOfDouble[53]);
		setBakeTemperatureFR(arrayOfDouble[54]);
		setNewField18(arrayOfDouble[55]);
		setNewField19(arrayOfDouble[56]);
		setNewField20(arrayOfDouble[57]);
		setNewField21(arrayOfDouble[58]);
		setCompletedLapsInRace(arrayOfDouble[59]);
		setTotalLapsInRace(arrayOfDouble[60]);
		setPreviousLapTime(arrayOfDouble[61]);
		setNewField26(arrayOfDouble[62]);
		setNewField27(arrayOfDouble[63]);
		//setNewField28(arrayOfDouble[64]);	
	}
	
	public void updateDataWithConsoleExit(double[] arrayOfDouble)
	{
		System.out.println("IN");
		int c = 0;
		for(double i : arrayOfDouble)
		{
			System.out.println(c + ": "+i);
			c++;
		}
		System.out.println("OUT");
	}
}
