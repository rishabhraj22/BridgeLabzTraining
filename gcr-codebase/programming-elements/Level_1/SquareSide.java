import java.util.Scanner;
public class SquareSide{
    public static void main(String[] args) {

        // Declaring variable to store perimeter
        double perimeter;

        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();

        // Calculating the side of the square using the formula
        double side = perimeter / 4;

        // Displaying the length and perimeter
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
