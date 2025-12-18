import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;
		
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Printing multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Displaying multiplication result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
