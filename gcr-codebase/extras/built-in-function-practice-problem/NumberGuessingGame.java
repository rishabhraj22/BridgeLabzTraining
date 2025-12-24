import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initializing range
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        // Loop until number is guessed correctly
        while (!guessedCorrectly) {

            // Generating random guess within range
            int guess = generateGuess(low, high, random);
            System.out.println("Computer guesses: " + guess);

            // Taking feedback from user
            System.out.print("Enter feedback (high / low / correct): ");
            String feedback = scanner.nextLine();

            // Updating range based on feedback
            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } 
            else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } 
            else if (feedback.equalsIgnoreCase("correct")) {
                guessedCorrectly = true;
                System.out.println("Computer guessed the number correctly!");
            }
        }
    }

    // Method to generate random guess
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
