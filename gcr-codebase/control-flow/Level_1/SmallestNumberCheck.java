import java.util.Scanner;
public class SmallestNumberCheck {
    public static void main(String[] args) {

        // Declaring variables to store three numbers
        int number1;
        int number2;
        int number3;

        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        // Checking if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Displaying if the first number is smallest or not 
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
