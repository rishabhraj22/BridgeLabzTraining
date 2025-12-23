import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for a person
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        bmi = Math.round(bmi * 100.0) / 100.0

        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    // Method to compute BMI table for all persons
    public static String[][] computeBMITable(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display BMI data in tabular format
    public static void displayBMIReport(String[][] table) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println((i + 1) + "\t" + table[i][0] + "\t\t" + table[i][1] + "\t\t" + table[i][2] + "\t" + table[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persons = 10;
        double[][] inputData = new double[persons][2];

        // Taking input from user
        for (int i = 0; i < persons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }

        // Processing
        String[][] bmiTable = computeBMITable(inputData);

        // Displaying
        displayBMIReport(bmiTable);

        sc.close();
    }
}
