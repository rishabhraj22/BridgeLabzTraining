import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calling the above method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Displaying the result
        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);

        sc.close();
    }
}
