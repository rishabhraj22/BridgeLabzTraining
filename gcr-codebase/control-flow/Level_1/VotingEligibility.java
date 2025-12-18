import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {

        // Declaring variable to store the age
        int age;

        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        // Checking voting eligibility based on age
        if (age >= 18) {
            // Displaying message if person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Displaying message if person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
