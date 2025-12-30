import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Constant fine rate per day
        final int FINE_PER_DAY = 5;

        // Loop to process 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i + ":");
            System.out.print("Enter due date (day number): ");
            int dueDate = scanner.nextInt();
            System.out.print("Enter return date (day number): ");
            int returnDate = scanner.nextInt();

            // Checking if book is returned late
            if (returnDate > dueDate) {

                // Calculating late days and calculating fine
                int lateDays = returnDate - dueDate;
                int fine = lateDays * FINE_PER_DAY;

                // Displaying fine details
                System.out.println("Book returned late by " + lateDays + " days.");
                System.out.println("Fine Amount: ₹" + fine);
            } 
            else {
                System.out.println("Book returned on time. No fine.");
            }
        }
    }
}
