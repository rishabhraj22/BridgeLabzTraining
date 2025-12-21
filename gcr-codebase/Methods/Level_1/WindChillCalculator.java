import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Calculating wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill);

        sc.close();
    }
}
