import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {

        // Declaring variables to store base and height and conversion factor
        double base;
        double height;
		double inchToCm = 2.54;

        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        height = input.nextDouble();

        // Calculating area of triangle
        double areaInSqInches = 0.5 * base * height; 
        
        // Converting area from square inches to square centimeters
        double areaInSqCm = areaInSqInches * inchToCm * inchToCm;

        // Displaying the area of triangle
        System.out.println("The area of the triangle in square inches is " + areaInSqInches + " and in square centimeters is " + areaInSqCm);
    }
}
