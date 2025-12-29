import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generating random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Declaring attempt counter and variable to store user's guess
        int attempts = 0; 
        int guess;

        // Do-while loop to allow at least one attempt
        do {

            // Asking user to enter a guess
            System.out.print("Enter your guess (1 to 100): ");
            guess = scanner.nextInt();

            attempts++;

            // Checking guess and giving hints
            if (guess > targetNumber) {
                System.out.println("Too high");
            } 
            else if (guess < targetNumber) {
                System.out.println("Too low");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
                break;
            }

        } while (attempts < 5);

        // Checking if attempts limit reached
        if (attempts == 5 && guess != targetNumber) {
            System.out.println("Game Over! You used all 5 attempts.");
            System.out.println("The correct number was: " + targetNumber);
        }
    }
}
