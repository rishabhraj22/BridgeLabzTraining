import java.util.Scanner;
public class BMICalculatorUsing2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Creating 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];

        // Creating array to store weight status of each person
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height = input.nextDouble();)
            double weight = input.nextDouble();

            // Validating height and weight
            if (height <= 0 || weight <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                // Decrementing index to re-enter values for the same person
                i--;
                continue;
            }

            // Storing height and weight in 2D array
            personData[i][0] = height;
            personData[i][1] = weight;
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            // Calculating BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining weight status based on BMI value
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";

            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";

            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";

            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI, and weight status of each person
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {

            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" + personData[i][2] + "\t" + weightStatus[i]);
        }

        input.close();
    }
}
