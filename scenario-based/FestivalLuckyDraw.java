import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("Visitor " + i + ", enter your number: ");
            int number = sc.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println("Invalid number! Skipping this visitor.");
                continue;
            }

            // Check lucky condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift");
            } else {
                System.out.println("Better luck next time!");
            }
        }

        sc.close();
    }
}
