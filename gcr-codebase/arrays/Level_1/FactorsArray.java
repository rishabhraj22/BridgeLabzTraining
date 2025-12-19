import java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Declaring initial maximum size for factors array and index variable to track number of factors stored
        int maxFactor = 10;
		int index = 0;

        // Creating factors array with initial size
        int[] factors = new int[maxFactor];
		
        // Loop to find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Checking if array size is full
                if (index == maxFactor) {

                    // Doubling the array size
                    maxFactor = maxFactor * 2;

                    // Creating temporary array with new size
                    int[] temp = new int[maxFactor];

                    // Copying old factors into new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assigning factors array to new expanded array
                    factors = temp;
                }

                // Storing factor in the array
                factors[index] = i;
                index++;
            }
        }

        // Displaying the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        input.close();
    }
}
