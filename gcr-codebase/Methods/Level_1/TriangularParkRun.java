import java.util.Scanner;

public class TriangularParkRun {
    
    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // perimeter in meters
        double totalDistance = 5000; // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Calculating number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying rounds
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }
}
