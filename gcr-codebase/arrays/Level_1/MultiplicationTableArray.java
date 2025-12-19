import java.util.Scanner;
public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Defining integer array to store multiplication results
        int[] table = new int[10];

        // Using loop to calculate and store multiplication values
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying the multiplication table from the array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
