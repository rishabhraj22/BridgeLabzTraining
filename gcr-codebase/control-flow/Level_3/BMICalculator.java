import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variable to store weight and height
        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        // Converting height from centimeters to meters
        double heightMeter = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Displaying the calculated BMI
        System.out.println("BMI value is: " + bmi);

        // Determining weight status based on BMI value
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
