import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Defining array size for number of employees
        int size = 10;

        // Declaring arrays to store salary and years of service
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];

        // Declaring arrays to store bonus amount and new salary
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Declaring variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < size; i++) {

            double enteredSalary = input.nextDouble();
            double enteredYears = input.nextDouble();

            // Validating salary and years of service
            if (enteredSalary <= 0 || enteredYears < 0) {

                System.out.println("Invalid input. Please enter again.");

                i--;
                continue;
            }

            // Storing valid salary and years of service in arrays
            salary[i] = enteredSalary;
            yearsOfService[i] = enteredYears;
        }

        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < size; i++) {

            // Adding current salary to total old salary
            totalOldSalary = totalOldSalary + salary[i];

            // Checking years of service condition for bonus
            if (yearsOfService[i] > 5) {

                // Calculating 5% bonus
                bonus[i] = salary[i] * 0.05;

            } else {

                // Calculating 2% bonus
                bonus[i] = salary[i] * 0.02;
            }

            // Calculating new salary after adding bonus
            newSalary[i] = salary[i] + bonus[i];

            // Adding bonus to total bonus payout
            totalBonus = totalBonus + bonus[i];

            // Adding new salary to total new salary
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Displaying total old salary, total bonus payout, and total new salary
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
