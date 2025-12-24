import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        // Getting current date
        LocalDate currentDate = LocalDate.now();

        // Defining first format
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Defining second format
        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Defining third format
        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Printing date in different formats
        System.out.println("Format 1: " + currentDate.format(format1));
        System.out.println("Format 2: " + currentDate.format(format2));
        System.out.println("Format 3: " + currentDate.format(format3));
    }
}
