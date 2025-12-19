import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
	    
		// Declaring variable to store the marks
		double physics;
		double chemistry;
		double maths;
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        chemistry = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        maths = sc.nextDouble();

        // Calculate total and average percentage
        double total = physics + chemistry + maths;
        double average = total / 3.0;

        // Variables to store grade and remarks
        char grade;
        String remarks;

        // Deciding grade and remarks using if-else
        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Output section
        System.out.println("\nRESULT");
        System.out.println("Average Mark : " + average);
        System.out.println("Grade        : " + grade);
        System.out.println("Remarks      : " + remarks);
    }
}
