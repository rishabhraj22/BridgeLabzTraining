import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {

        // Declaring the variable to store height and conversion values
        double heightCm;
		double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        Scanner input = new Scanner(System.in);
        heightCm = input.nextDouble();

        // Converting centimeters to total inches
        double totalInches = heightCm / cmPerInch;

        // Calculating feet from total inches and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        // Displaying the height in cm, feet and inches
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
