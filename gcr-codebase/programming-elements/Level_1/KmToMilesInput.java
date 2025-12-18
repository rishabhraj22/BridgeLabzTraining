import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {

        // Declaring the variable to store kilometers
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        double conversionFactor = 1.6;

        // Converting kilometers to miles
        double miles = km / conversionFactor;

        // Displaying the miles
        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }
}
