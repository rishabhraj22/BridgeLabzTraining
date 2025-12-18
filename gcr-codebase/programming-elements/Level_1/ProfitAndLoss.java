// Creating class ProfitAndLoss

class ProfitAndLoss {
    public static void main(String[] args) {

        // Declaring variables
        int costPrice = 129;
        int sellingPrice = 191;
		
		// Calculating profit
        int profit = sellingPrice - costPrice;

        // Calculating profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Displaying cost price, selling price, profit and profit percentage
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
