import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {

        // Declaring variable to store the counter value
        int counter;

        Scanner input = new Scanner(System.in);
        counter = input.nextInt();

        // Counting down using while loop
        while (counter >= 1) {

            // Displaying the current counter value
            System.out.println(counter);

            counter--;
        }
    }
}
