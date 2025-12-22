import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateStudentAges(int n) {

        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(100); // 0 to 99 (2-digit)
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] table) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        // Generating ages
        int[] ages = generateStudentAges(numberOfStudents);

        // Checking voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Displaying result
        displayResult(votingStatus);

        sc.close();
    }
}
