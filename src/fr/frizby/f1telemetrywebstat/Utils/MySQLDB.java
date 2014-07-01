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
}
