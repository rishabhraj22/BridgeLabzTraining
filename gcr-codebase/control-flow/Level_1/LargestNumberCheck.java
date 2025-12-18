import java.util.Scanner;
public class LargestNumberCheck {
    public static void main(String[] args) {

        // Declaring variables to store three numbers
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // Checking which number is the largest
        boolean isFirstLargest = (num1 > num2) && (num1 > num3);
        boolean isSecondLargest = (num2 > num1) && (num2 > num3);
        boolean isThirdLargest = (num3 > num1) && (num3 > num2);

        // Displaying which number is largest
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
