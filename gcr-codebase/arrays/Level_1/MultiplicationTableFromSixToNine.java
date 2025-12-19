import java.util.Scanner;
public class MultiplicationTableFromSixToNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store the number
        int number = input.nextInt();

        // Defining integer array to store multiplication results)
        int[] multiplicationResult = new int[4];

        // Using for loop to calculate multiplication table
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Displaying the multiplication table from the array
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
