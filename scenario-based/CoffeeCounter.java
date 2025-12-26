import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring variable to control loop
        boolean running = true;

        // Loop to keep serving customers
        while (running) {

            // Asking user for coffee type
            System.out.println("\nAvailable Coffee Types:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Cappuccino");
            System.out.print("Enter coffee type (or type 'exit' to stop): ");

            String choice = scanner.nextLine();

            // Checking exit condition
            if (choice.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Thank you! Café closed.");
                break;
            }

            // Asking for quantity
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // clearing buffer

            // Declaring price variable
            double price = 0;

            // Selecting coffee price using switch
            switch (choice) {
                case "1":
                    price = 120;
                    break;
                case "2":
                    price = 150;
                    break;
                case "3":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            // Calculating total price, gst and final bill amount
            double total = price * quantity;
            double gst = total * 0.05;
            double finalBill = total + gst;

            // Displaying bill details
            System.out.println("Total Amount: ₹" + total);
            System.out.println("GST (5%): ₹" + gst);
            System.out.println("Final Bill: ₹" + finalBill);
        }
    }
}
