import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        
		// Declaring variables and initializing it
        int smallest = number1;
        int largest = number1;
		
        // Checking for smallest and largest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Calling the above method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Displaying which number is smallest and largest
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);

        sc.close();
    }
}
