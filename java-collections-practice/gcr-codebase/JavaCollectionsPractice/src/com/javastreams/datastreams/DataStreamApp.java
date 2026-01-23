package com.javastreams.datastreams;
import java.io.IOException;
import java.util.Scanner;

public class DataStreamApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        Student student = new Student(roll, name, gpa);

        StudentDataWriter writer = new StudentDataWriter();
        StudentDataReader reader = new StudentDataReader();

        String filePath = "student.dat";

        try {
            // Write data
            writer.writeStudent(filePath, student);
            System.out.println("✅ Student data stored successfully.");

            // Read data
            Student savedStudent = reader.readStudent(filePath);
            System.out.println("\n📄 Retrieved Student Details:");
            System.out.println("Roll No: " + savedStudent.getRollNumber());
            System.out.println("Name   : " + savedStudent.getName());
            System.out.println("GPA    : " + savedStudent.getGpa());

        } catch (IOException e) {
            System.out.println("❌ File error: " + e.getMessage());
        }

        sc.close();
    }
}
