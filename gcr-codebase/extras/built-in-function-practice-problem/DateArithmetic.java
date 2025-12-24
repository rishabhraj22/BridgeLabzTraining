import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter date
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        // Defining date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parsing input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Printing final date
        System.out.println("Final Date after calculations: " + updatedDate);
    }
}
