import java.util.Scanner;
public class ArraySumUntilStop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Defining double array to store values
        double[] numbers = new double[10];

        // Declaring variable to store total sum and index variable to track array position
        double total = 0.0; 
        int index = 0;

        // Using infinite while loop to take user input
        while (true) {
			
            double value = input.nextDouble();

            // Checking if user entered 0 or a negative number
            if (value <= 0) {
                break;
            }
			
			// Checking if array size limit (10) is reached
            if (index == 10) {
                break;
            }

            // Storing the value in the array
            numbers[index] = value;
			index++;
        }

        // Using loop to calculate the sum of stored values
        for (int i = 0; i < index; i++) {
            // Adding each array element to total
            total = total + numbers[i];
        }

        // Displaying all stored numbers
        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Displaying the total sum
        System.out.println("The total sum is " + total);

        input.close();
    }
}
