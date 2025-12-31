public class DigitalWatchSimulation {

    public static void main(String[] args) {

        // Loop for hours
        for (int hour = 0; hour < 24; hour++) {

            // Loop for minutes
            for (int minute = 0; minute < 60; minute++) {

                // Formatting hour and minute
                String formattedHour = (hour < 10) ? "0" + hour : "" + hour;
                String formattedMinute = (minute < 10) ? "0" + minute : "" + minute;

                // Printing time in HH:MM format
                System.out.println(formattedHour + ":" + formattedMinute);

                // Simulating power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped.");
                    break;
                }
            }

            // Breaking outer loop after power cut
            if (hour == 13) {
                break;
            }
        }
    }
}
