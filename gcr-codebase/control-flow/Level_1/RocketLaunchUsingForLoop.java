import java.util.Scanner;
public class RocketLaunchUsingForLoop {
    public static void main(String[] args) {

        // Declaring variable to store the counter value
        int counter;

        Scanner input = new Scanner(System.in);
        counter = input.nextInt();

        // Counting down using for loop
        for (int i = counter; i >= 1; i--) {
            // Displaying the current counter value
            System.out.println(i);
        }
    }
}
