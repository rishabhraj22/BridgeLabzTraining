import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable to control conversion loop
        char continueChoice;

        // Do-while loop to allow at least one conversion
        do {

            System.out.print("Enter amount in INR: ");
            double inrAmount = scanner.nextDouble();

            // Displaying currency options
            System.out.println("Select target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter your choice: ");

            int currencyChoice = scanner.nextInt();

            // Variable to store conversion rate
            double rate = 0;

            // Selecting conversion rate using switch
            switch (currencyChoice) {

                case 1:
                    rate = 0.012;
                    break;

                case 2:
                    rate = 0.011;
                    break;

                case 3:
                    rate = 0.0095;
                    break;

                case 4:
                    rate = 1.65;
                    break;

                default:
                    System.out.println("Invalid currency choice.");
                    continue;
            }

            // Calculating converted amount and Displaying converted amount
            double convertedAmount = inrAmount * rate;
            System.out.println("Converted Amount: " + convertedAmount);

            // Asking user if they want another conversion
            System.out.print("Do you want another conversion? (y/n): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y');
    }
}
