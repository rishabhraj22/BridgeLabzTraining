import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring array to store temperatures for 7 days
        double[] temperatures = new double[7];

        for (int day = 0; day < temperatures.length; day++) {
            System.out.print("Enter temperature for day " + (day + 1) + ": ");
            temperatures[day] = scanner.nextDouble();
        }

        // Calculating average temperature and finding maximum temperature
        double averageTemperature = calculateAverage(temperatures);
        double maxTemperature = findMaximum(temperatures);

        // Displaying average temperature and maximum temperature
        System.out.println("\n--- Temperature Report ---");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Maximum Temperature: " + maxTemperature);
    }

    // Method for calculating average temperature
    public static double calculateAverage(double[] temps) {

        double sum = 0;

        // Looping through array to calculate sum
        for (double temp : temps) {
            sum = sum + temp;
        }

        // Returning average value
        return sum / temps.length;
    }

    // Method to find maximum temperature
    public static double findMaximum(double[] temps) {

        double max = temps[0];

        // Comparing temperatures using if condition
        for (double temp : temps) {
            if (temp > max) {
                max = temp;
            }
        }

        // Returning maximum temperature
        return max;
    }
}
