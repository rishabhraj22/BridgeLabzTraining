import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for choice
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        // Performing conversion based on choice
        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } 
        else if (choice == 2) {
            System.out.print("Enter Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
