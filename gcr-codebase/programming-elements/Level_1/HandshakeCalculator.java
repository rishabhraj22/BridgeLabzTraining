import java.util.Scanner;
public class HandshakeCalculator {
    public static void main(String[] args) {

        // Declaring variable to store number of students
        int numOfStudents;
		
        Scanner input = new Scanner(System.in);
        numOfStudents = input.nextInt();

        // Calculating maximum number of handshakes
        int handshakes = (numOfStudents * (numOfStudents - 1)) / 2;

        // Displaying the number of possible handshakes
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
