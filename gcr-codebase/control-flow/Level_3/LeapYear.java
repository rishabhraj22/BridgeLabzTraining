import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        // Declaring variable to store the year
        int year;

        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        // Checking if year is valid by Gregorian calendar
        if (year >= 1582) {

            // Part 1: Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");

            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");

            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");

            } else {
                System.out.println("Year is not a Leap Year");
            }

            // Part 2: Using single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }

        } else {
            // Displaying message if year is before 1582
            System.out.println("Year must be greater than or equal to 1582");
        }
    }
}
