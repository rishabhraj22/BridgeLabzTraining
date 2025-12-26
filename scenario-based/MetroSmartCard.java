import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initial smart card balance
        double balance = 200.0;

        // Declaring variable to control loop
        boolean active = true;

        // Loop to allow multiple metro trips
        while (active && balance > 0) {

            System.out.println("\nCurrent Balance: ₹" + balance);

            System.out.print("Enter travel distance in km (or -1 to quit): ");
            int distance = scanner.nextInt();

            // Checking exit condition
            if (distance == -1) {
                System.out.println("User exited. Thank you!");
                break;
            }

            // Calculating fare using ternary operator
            double fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : (distance <= 25) ? 30 : 40;

            // Checking if sufficient balance is available
            if (fare > balance) {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }

            // Deducting fare from balance
            balance = balance - fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        }

        // Displaying final message
        System.out.println("Metro Smart Card session ended.");
    }
}
