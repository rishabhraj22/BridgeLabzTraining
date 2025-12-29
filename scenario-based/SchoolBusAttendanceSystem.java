import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring array of student names
        String[] students = {"Amit", "Ravi", "Neha", "Priya", "Rahul", "Anita", "Suresh", "Pooja", "Karan", "Sneha"};

        // Variables to count present and absent students
        int presentCount = 0;
        int absentCount = 0;

        // Looping through each student using for-each loop
        for (String student : students) {

            // Asking attendance status for each student
            System.out.print("Is " + student + " Present or Absent? ");
            String status = scanner.nextLine();

            // Checking attendance status
            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } 
            else {
                absentCount++;
            }
        }

        // Printing total attendance summary
        System.out.println("\n--- Attendance Summary ---");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);
    }
}
