import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {

        // Declaring variable to store distance and conversion values
        double distanceInFeet;
		double feetPerYard = 3;
        double yardsPerMile = 1760;
		
        Scanner input = new Scanner(System.in);
        distanceInFeet = input.nextDouble();
		
        // Converting feet to yards and yards to miles
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Displaying the distance in yards and miles
        System.out.println("The distance in yards is " + distanceInYards + " and miles is " + distanceInMiles);
    }
}
