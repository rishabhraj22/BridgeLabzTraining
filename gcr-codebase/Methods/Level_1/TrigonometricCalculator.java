import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Converting degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling the above method
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying sine, cosine and tangent
        System.out.println("Sine of " + angle + "° is: " + result[0]);
        System.out.println("Cosine of " + angle + "° is: " + result[1]);
        System.out.println("Tangent of " + angle + "° is: " + result[2]);

        sc.close();
    }
}
