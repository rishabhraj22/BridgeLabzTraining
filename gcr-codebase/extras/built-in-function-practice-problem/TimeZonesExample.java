import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample {

    public static void main(String[] args) {

        // Getting current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Getting current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Getting current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Printing time in different time zones
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}
