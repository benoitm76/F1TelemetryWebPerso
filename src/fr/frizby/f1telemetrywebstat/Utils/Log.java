package fr.frizby.f1telemetrywebstat.Utils;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Log {
	
	private static Logger logger = Logger.getLogger("F1TelemetryWebStat");
	
	private Log()
	{
		logger.setLevel(Level.ALL);
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		logger.addHandler(ch);
	}
	private static Log INSTANCE = new Log();
	
	public static Log getInstance()
	{
		return INSTANCE;
	}
	
	public static void i(String msg)
	{
		logger.log(Level.INFO, msg);
	}
	
	public static void e(String msg)
	{
		logger.log(Level.WARNING, msg);
	}
	
	public static void wtf(String msg)
	{
		logger.log(Level.SEVERE, msg);
	}
	
	public static void c(String msg)
	{
		logger.log(Level.CONFIG, msg);
	}
}
