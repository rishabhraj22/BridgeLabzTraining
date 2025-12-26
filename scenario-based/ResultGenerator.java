import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring array to store marks of 5 subjects
        int[] marks = new int[5];

        // Variable to store total marks
        int total = 0;

        // Loop to take marks input
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Adding marks to total
            total = total + marks[i];
        }

        // Calculating average marks
        double average = total / 5.0;

        // Printing average
        System.out.println("Average Marks: " + average);

        // Assigning grade using switch
        char grade;

        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Printing grade
        System.out.println("Grade: " + grade);
    }
}
