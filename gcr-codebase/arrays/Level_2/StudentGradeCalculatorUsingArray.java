import java.util.Scanner;
public class StudentGradeCalculatorUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        // Creating arrays to store marks of Physics, Chemistry, and Maths
        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];

        // Creating array to store percentage of students and to store grade of students
        double[] percentage = new double[numberOfStudents]; 
        char[] grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Physics marks
            int p = input.nextInt();
            // Chemistry marks
            int c = input.nextInt();
            // Maths marks
            int m = input.nextInt();

            // Validating marks)
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                // Decrementing index to re-enter data for the same student
                i--;
                continue;
            }

            // Storing valid marks in arrays
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // Loop to calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            // Calculating percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Determining grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';

            } else if (percentage[i] >= 70) {
                grade[i] = 'B';

            } else if (percentage[i] >= 60) {
                grade[i] = 'C';

            } else if (percentage[i] >= 50) {
                grade[i] = 'D';

            } else if (percentage[i] >= 40) {
                grade[i] = 'E';

            } else {
                grade[i] = 'R';
            }
        }

        // Displaying marks, percentage, and grade of each student
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(physics[i] + "\t\t" + chemistry[i] + "\t\t" + maths[i] + "\t" + percentage[i] + "\t\t" + grade[i]);
        }

        input.close();
    }
}
