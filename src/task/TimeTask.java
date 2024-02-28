package task;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeTask {
	public ZonedDateTime getCurrentTime() {
		return ZonedDateTime.now();
	}
	public Long getCurrentTimeInMs() {
		
		return System.currentTimeMillis();
	}
	public Long getCurrentTimeMills() {
		ZonedDateTime currentTime = ZonedDateTime.now();
		Instant now = currentTime.toInstant();
		return now.toEpochMilli();
	}
	public Set<String> getZones(){
		return ZoneId.getAvailableZoneIds();
	}
	public ZonedDateTime getZonedDateTime(String zone) {
		return ZonedDateTime.now(ZoneId.of(zone)) ;	
	}
	
	public ZonedDateTime getZonedDate(long currentTime,String zone) {
		Instant instant = Instant.ofEpochMilli(currentTime);
	    return instant.atZone(ZoneId.of(zone));
	    
	}
	
	public DayOfWeek getDayOfWeek(long currentTime,String zone) {
	   ZonedDateTime zoneDate = getZonedDate(currentTime,zone);
	   return zoneDate.getDayOfWeek();
	}
	
	public Month getMonth(long currentTime,String zone) {
	   ZonedDateTime zoneDate = getZonedDate(currentTime,zone);
	   return zoneDate.getMonth();
	}
		
	public int getYear(long currentTime,String zone) {
		ZonedDateTime zoneDate = getZonedDate(currentTime,zone);
		return zoneDate.getYear();  
	}
}
