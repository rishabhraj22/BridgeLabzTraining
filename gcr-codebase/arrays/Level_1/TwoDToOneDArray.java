import java.util.Scanner;
public class TwoDToOneDArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Creating 2D array with given rows and columns
        int[][] matrix = new int[rows][columns];

        // Taking user input for elements of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Creating 1D array to store elements of 2D array
        int[] array = new int[rows * columns];

        // Declaring index variable for 1D array
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {

            // Looping through columns of each row
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Displaying elements of the 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}
