import java.util.Scanner;
public class AbundantNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number entered by user and to store sum of divisors
        int number = input.nextInt(); 
        int sum = 0;

        // Running for loop to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Checking if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

    }
}
