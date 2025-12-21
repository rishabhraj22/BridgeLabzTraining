import java.util.Scanner;

public class LeapYearChecker {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {

        // Checking leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {

            // Checking leap year
            if (isLeapYear(year)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }

        sc.close();
    }
}
