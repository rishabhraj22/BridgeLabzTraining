import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculating BMI
        double bmi = weight / (height * height);

        // Printing BMI value
        System.out.println("BMI Value: " + bmi);

        // Checking BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }
    }
}
