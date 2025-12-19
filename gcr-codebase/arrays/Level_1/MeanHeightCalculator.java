import java.util.Scanner;
public class MeanHeightCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Defining double array to store heights of players
        double[] heights = new double[11];

        // Declaring variable to store sum of heights
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        // Calculating sum of all heights
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // Calculating mean height using formula
        double meanHeight = sum / heights.length;

        // Displaying the mean height of the football team
        System.out.println("The mean height of the football team is " + meanHeight);

        input.close();
    }
}
