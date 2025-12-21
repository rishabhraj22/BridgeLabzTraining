import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculating sum
        int result = calculateSum(n);

        // Displaying the resultant sum
        System.out.println("The sum of first " + n + " natural numbers is " + result);

        sc.close();
    }
}
