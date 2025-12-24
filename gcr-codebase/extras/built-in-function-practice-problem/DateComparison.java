import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date (dd-MM-yyyy): ");
        String date1Input = scanner.nextLine();
        System.out.println("Enter second date (dd-MM-yyyy): ");
        String date2Input = scanner.nextLine();

        // Defining date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parsing both dates
        LocalDate date1 = LocalDate.parse(date1Input, formatter);
        LocalDate date2 = LocalDate.parse(date2Input, formatter);

        // Comparing the dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before second date");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is after second date");
        } 
        else {
            System.out.println("Both dates are the same");
        }
    }
}
