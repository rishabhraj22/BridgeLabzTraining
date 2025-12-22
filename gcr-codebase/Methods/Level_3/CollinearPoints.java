import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // To avoid division by zero, compare using cross multiplication
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Checking using slope formula
        boolean slopeResult = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Checking using area formula
        boolean areaResult = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Displaying both the results
        System.out.println("\nUsing Slope Formula:");
        System.out.println("Are the points collinear? " + slopeResult);

        System.out.println("\nUsing Area of Triangle Formula:");
        System.out.println("Are the points collinear? " + areaResult);

        sc.close();
    }
}
