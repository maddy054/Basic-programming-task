package tester;

import task.TimeTask;
import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimeTester {
	public static void main(String... args){
		Logger logger = Logger.getLogger("myLogger");
		
		logger.config("logger mesage");
		TimeTask newTask = new TimeTask();
		ZonedDateTime currentTime  = newTask.getCurrentTime();
		long timeInMilli = newTask.getCurrentTimeMills();
		logger.log(Level.INFO,  "Current Time with date is "+currentTime) ;
		logger.info("current Time in millisecond is "+newTask.getCurrentTimeInMs());
		logger.log(Level.INFO, "currentTime in millisecond is "+ newTask.getCurrentTimeMills());
		logger.log(Level.INFO, newTask.getZones().toString());
		logger.log(Level.INFO,  "current time in london is "+newTask.getZonedDateTime("Europe/London"));
		logger.log(Level.INFO, "current time in new york is "+newTask.getZonedDateTime("America/New_York"));
		logger.log(Level.INFO, "day of the week is "+newTask.getDayOfWeek(timeInMilli,"Asia/Kolkata"));	
		logger.log(Level.INFO, "Month from milli is "+newTask.getMonth(timeInMilli,"Asia/Kolkata"));
		logger.log(Level.INFO, "Year from milli is "+newTask.getYear(timeInMilli,"Asia/Kolkata"));
		
	}

}
