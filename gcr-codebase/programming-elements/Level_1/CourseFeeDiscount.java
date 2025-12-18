// Creating class CourseFeeDiscount

class CourseFeeDiscount {
    public static void main(String[] args) {

        // Declaring variables
        double fee = 125000;
        double discountPercent = 10;

        // Calculating the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculating the final discounted fee
        double finalFee = fee - discount;

        // Displaying the discount and final fee
        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );
    }
}
