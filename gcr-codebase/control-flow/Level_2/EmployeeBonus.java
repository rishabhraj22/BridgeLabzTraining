import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        // Declaring variables to store salary and years of service
        double salary;
        int yearsOfService;

        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        yearsOfService = input.nextInt();

        // Checking years of service
        if (yearsOfService > 5) {

            // Calculating bonus as 5% of salary
            double bonus = salary * 0.05;

            // Displaying the bonus amount
            System.out.println("The bonus amount is " + bonus);

        } else {

            System.out.println("The bonus amount is 0");
        }
    }
}
