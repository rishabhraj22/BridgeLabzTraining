import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {

        // Declaring variable to store the number
        int number;
		
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        // Checking if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Displaying the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
