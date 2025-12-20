import java.util.Scanner;
public class TeamBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfPersons = input.nextInt();

        // Creating arrays to store height, weight, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            height[i] = input.nextDouble();
            weight[i] = input.nextDouble();
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {

            // Calculating BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determining weight status based on BMI value
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";

            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";

            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";

            } else {
                status[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI, and weight status of each person
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i]);
        }

        input.close();
    }
}
