import java.util.Scanner;
public class StudentGradeCalculatorUsing2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        // Creating 2D array to store marks, percentage of students and grade of students
        int[][] marks = new int[numberOfStudents][3]; 
        double[] percentage = new double[numberOfStudents]; 
        char[] grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Taking input for Physics, Chemistry, and Maths marks
            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();

            // Validating marks
            if (p < 0 || c < 0 || m < 0) {

                System.out.println("Invalid marks. Please enter positive values.");
                // Decrementing index to re-enter data for the same student
                i--;
                continue;
            }

            // Storing valid marks in the 2D array
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // Loop to calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {

            // Calculating percentage using marks from 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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

            System.out.println(marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + percentage[i] + "\t\t" + grade[i]);
        }

        input.close();
    }
}
