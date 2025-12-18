import java.util.Scanner;
public class CourseFeeDiscountInput{
    public static void main(String[] args) {

        // Declaring the variable to store course fee and store discount percentage
        double fee; 
        double discountPercent;
		
        Scanner input = new Scanner(System.in);
        fee = input.nextDouble();
        discountPercent = input.nextDouble();

        // Calculating the discount amount and final discounted fee
        double discount = (fee * discountPercent) / 100; 
        double finalFee = fee - discount;

        // Displaying the discount and final fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
