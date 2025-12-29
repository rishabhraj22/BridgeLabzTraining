import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initialise mobile balance and Variable to control recharge loop
        double balance = 0;
        boolean rechargeActive = true;

        // Loop to allow repeated recharges
        while (rechargeActive) {

            // Displaying recharge menu
            System.out.println("\n--- Mobile Recharge Menu ---");
            System.out.println("1. Airtel");
            System.out.println("2. Jio");
            System.out.println("3. VI");
            System.out.println("4. Exit");
            System.out.print("Choose your operator: ");

            int choice = scanner.nextInt();

            // Exit condition
            if (choice == 4) {
                System.out.println("Recharge session ended.");
                break;
            }

            // Asking recharge amount
            System.out.print("Enter recharge amount: ");
            double amount = scanner.nextDouble();

            // Adding amount to balance
            balance = balance + amount;

            // Displaying offers using switch
            switch (choice) {

                case 1:
                    System.out.println("Airtel Offer: 1.5GB/day for 28 days");
                    break;

                case 2:
                    System.out.println("Jio Offer: 2GB/day for 30 days");
                    break;

                case 3:
                    System.out.println("VI Offer: Unlimited calls + 1GB/day");
                    break;

                default:
                    System.out.println("Invalid operator selected.");
                    continue;
            }

            // Displaying updated balance
            System.out.println("Recharge Successful.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }
}
