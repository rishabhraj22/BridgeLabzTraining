package com.csvdatahandling.studentdetails;
import java.util.*;

public class MainReadStudentCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        StudentCSVReader reader = new StudentCSVReader();
        List<Student> students = reader.readStudents(path);

        for (Student s : students) {
            s.display();
        }
    }
}
