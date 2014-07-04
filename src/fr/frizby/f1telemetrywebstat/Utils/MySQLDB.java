package fr.frizby.f1telemetrywebstat.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class MySQLDB {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public MySQLDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/f1telemetry?user=root&password=");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int createLap(ArrayList<Double> arg)
	{
		try {
			preparedStatement = connect.prepareStatement("INSERT INTO lap (lap_date, lap_averageSpeed, lap_fuelConsuption, lap_kersConsuption, lap_drsTime) VALUES (?, ?, ?, ?, ?);", PreparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setTimestamp(1, new java.sql.Timestamp(new Date().getTime()));
			preparedStatement.setDouble(2, arg.get(0));
			preparedStatement.setDouble(3, arg.get(1));
			preparedStatement.setDouble(4, arg.get(2));
			preparedStatement.setDouble(5, arg.get(3));
			
			preparedStatement.executeUpdate();
			
			resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next())
			{
				return resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public boolean addLapInfo(int lapId, F1Data arg)
	{
		try
		{
			preparedStatement = connect.prepareStatement("INSERT INTO lapinfo (lap_id, lapInfo_time, lapInfo_lapTime, lapInfo_lapDistance, lapInfo_distance, lapInfo_posX, lapInfo_posY, lapInfo_posZ, lapInfo_speed, lapInfo_posXV, lapInfo_posYV, lapInfo_posZV, lapInfo_posXR, lapInfo_roll, lapInfo_posZR, lapInfo_posXD, lapInfo_pitch, lapInfo_posZD, lapInfo_suspensionPositionRL, lapInfo_suspensionPositionRR, lapInfo_suspensionPositionFL, lapInfo_suspensionPositionFR, lapInfo_suspensionVelocityRL, lapInfo_suspensionVelocityRR, lapInfo_suspensionVelocityFL, lapInfo_suspensionVelocityFR, lapInfo_wheelSpeedRL, lapInfo_wheelSpeedRR, lapInfo_wheelSpeedFL, lapInfo_wheelSpeedFR, lapInfo_throttle, lapInfo_steer, lapInfo_brake, lapInfo_clutch, lapInfo_gear, lapInfo_gForceLatitudinal, lapInfo_gForceLongitudinal, lapInfo_lap, lapInfo_engineRpm, lapInfo_newField1, lapInfo_racePosition, lapInfo_KersRemaining, lapInfo_kersRecharge, lapInfo_drsStatus, lapInfo_difficulty, lapInfo_assists, lapInfo_fuelRemaining, lapInfo_sessionType, lapInfo_newField10, lapInfo_sector, lapInfo_timeSector1, lapInfo_timeSector2, lapInfo_bakeTemperatureRL, lapInfo_bakeTemperatureRR, lapInfo_bakeTemperatureFL, lapInfo_bakeTemperatureFR, lapInfo_newField18, lapInfo_newField19, lapInfo_newField20, lapInfo_newField21, lapInfo_completedLapsInRace, lapInfo_totalLapsInRace, lapInfo_PreviousLapTime, lapInfo_newField26, lapInfo_newField27, lapInfo_newField28) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
			preparedStatement.setInt(1, lapId);
			preparedStatement.setDouble(2, arg.getTime());
			preparedStatement.setDouble(3, arg.getLapTime());
			preparedStatement.setDouble(4, arg.getLapDistance());
			preparedStatement.setDouble(5, arg.getDistance());
			preparedStatement.setDouble(6, arg.getPosX());
			preparedStatement.setDouble(7, arg.getPosY());
			preparedStatement.setDouble(8, arg.getPosZ());
			preparedStatement.setDouble(9, arg.getSpeed());
			preparedStatement.setDouble(10, arg.getPosXV());
			preparedStatement.setDouble(11, arg.getPosYV());
			preparedStatement.setDouble(12, arg.getPosZV());
			preparedStatement.setDouble(13, arg.getPosXR());
			preparedStatement.setDouble(14, arg.getRoll());
			preparedStatement.setDouble(15, arg.getPosZR());
			preparedStatement.setDouble(16, arg.getPosXD());
			preparedStatement.setDouble(17, arg.getPitch());
			preparedStatement.setDouble(18, arg.getPosZD());
			preparedStatement.setDouble(19, arg.getSuspensionPositionRL());
			preparedStatement.setDouble(20, arg.getSuspensionPositionRR());
			preparedStatement.setDouble(21, arg.getSuspensionPositionFL());
			preparedStatement.setDouble(22, arg.getSuspensionPositionFR());
			preparedStatement.setDouble(23, arg.getSuspensionVelocityRL());
			preparedStatement.setDouble(24, arg.getSuspensionVelocityRR());
			preparedStatement.setDouble(25, arg.getSuspensionVelocityFL());
			preparedStatement.setDouble(26, arg.getSuspensionVelocityFR());
			preparedStatement.setDouble(27, arg.getWheelSpeedRL());
			preparedStatement.setDouble(28, arg.getWheelSpeedRR());
			preparedStatement.setDouble(29, arg.getWheelSpeedFL());
			preparedStatement.setDouble(30, arg.getWheelSpeedFR());
			preparedStatement.setDouble(31, arg.getThrottle());
			preparedStatement.setDouble(32, arg.getSteer());
			preparedStatement.setDouble(33, arg.getBrake());
			preparedStatement.setDouble(34, arg.getClutch());
			preparedStatement.setDouble(35, arg.getGear());
			preparedStatement.setDouble(36, arg.getgForceLatitudinal());
			preparedStatement.setDouble(37, arg.getgForceLongitudinal());
			preparedStatement.setDouble(38, arg.getLap());
			preparedStatement.setDouble(39, arg.getEngineRpm());
			preparedStatement.setDouble(40, arg.getNewField1());
			preparedStatement.setDouble(41, arg.getRacePosition());
			preparedStatement.setDouble(42, arg.getKersRemaining());
			preparedStatement.setDouble(43, arg.getKersRecharge());
			preparedStatement.setDouble(44, arg.getDrsStatus());
			preparedStatement.setDouble(45, arg.getDifficulty());
			preparedStatement.setDouble(46, arg.getAssists());
			preparedStatement.setDouble(47, arg.getFuelRemaining());
			preparedStatement.setDouble(48, arg.getSessionType());
			preparedStatement.setDouble(49, arg.getNewField10());
			preparedStatement.setDouble(50, arg.getSector());
			preparedStatement.setDouble(51, arg.getTimeSector1());
			preparedStatement.setDouble(52, arg.getTimeSector2());
			preparedStatement.setDouble(53, arg.getBakeTemperatureRL());
			preparedStatement.setDouble(54, arg.getBakeTemperatureRR());
			preparedStatement.setDouble(55, arg.getBakeTemperatureFL());
			preparedStatement.setDouble(56, arg.getBakeTemperatureFR());
			preparedStatement.setDouble(57, arg.getNewField18());
			preparedStatement.setDouble(58, arg.getNewField19());
			preparedStatement.setDouble(59, arg.getNewField20());
			preparedStatement.setDouble(60, arg.getNewField21());
			preparedStatement.setDouble(61, arg.getCompletedLapsInRace());
			preparedStatement.setDouble(62, arg.getTotalLapsInRace());
			preparedStatement.setDouble(63, arg.getPreviousLapTime());
			preparedStatement.setDouble(64, arg.getNewField26());
			preparedStatement.setDouble(65, arg.getNewField27());
			preparedStatement.setDouble(66, arg.getNewField28());
			
			if(preparedStatement.executeUpdate() != 0)
			{
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
