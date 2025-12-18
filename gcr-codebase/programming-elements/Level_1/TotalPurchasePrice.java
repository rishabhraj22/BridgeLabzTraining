import java.util.Scanner;
public class TotalPurchasePrice {
    public static void main(String[] args) {

        // Declaring variables to store unit price and quantity
        double unitPrice;
        int quantity;
		
        Scanner input = new Scanner(System.in);
        unitPrice = input.nextDouble();
        quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying the total purchase price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
