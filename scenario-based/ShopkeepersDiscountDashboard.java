import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Declaring constant values for discount rates
    static final double DISCOUNT_10 = 0.10;
    static final double DISCOUNT_20 = 0.20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asking user for number of items
        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();

        // Variable to store total bill amount
        double totalBill = 0;

        // Loop to take price of each item
        for (int i = 1; i <= numberOfItems; i++) {

            // Asking price for each item
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();

            totalBill = totalBill + price;
        }

        // Displaying total bill before discount
        System.out.println("Total Bill Amount: ₹" + totalBill);

        // Variable to store discount amount
        double discount = 0;

        // Applying discount based on total bill
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } 
        else if (totalBill >= 2000) {
            discount = totalBill * DISCOUNT_10;
        } 
        else {
            discount = 0;
        }

        // Calculating final payable amount
        double finalAmount = totalBill - discount;

        // Displaying discount and final amount
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
    }
}
