import java.util.Scanner;
public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Displaying the number of possible handshakes
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();
    }
}
