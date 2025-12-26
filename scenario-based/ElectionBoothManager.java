import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring variables to store votes for candidates and to control voting loop
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0; 
        boolean votingOpen = true;

        // Loop to allow multiple voters
        while (votingOpen) {

            // Asking voter to enter age
            System.out.print("\nEnter age (or enter -1 to stop voting): ");
            int age = scanner.nextInt();

            // Checking exit condition
            if (age == -1) {
                votingOpen = false;
                break;
            }

            // Checking voter eligibility
            if (age >= 18) {

                // Displaying voting options
                System.out.println("Vote for your candidate:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");
                System.out.print("Enter your vote (1/2/3): ");

                int vote = scanner.nextInt();

                // Recording vote using switch
                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        break;
                    case 2:
                        candidate2Votes++;
                        break;
                    case 3:
                        candidate3Votes++;
                        break;
                    default:
                        System.out.println("Invalid vote!");
                }

                System.out.println("Vote recorded successfully.");
            } 
            else {
                System.out.println("You are not eligible to vote.");
            }
        }

        // Displaying final voting results
        System.out.println("\n--- Election Results ---");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);
        System.out.println("Voting Closed.");
    }
}
