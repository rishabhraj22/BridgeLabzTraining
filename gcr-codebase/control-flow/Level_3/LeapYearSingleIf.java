import java.util.Scanner;
public class LeapYearSingleIf {
    public static void main(String[] args) {

        // Declaring variable to store the year
        int year;

        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        // Checking Leap Year using single if condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
