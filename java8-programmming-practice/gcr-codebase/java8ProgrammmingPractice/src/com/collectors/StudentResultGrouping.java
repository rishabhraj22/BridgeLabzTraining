package com.collectors;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class StudentResultGrouping {

    static class Student {
        String name;
        String grade;

        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter grade: ");
            String grade = sc.nextLine();
            students.add(new Student(name, grade));
        }

        Map<String, List<String>> grouped =
                students.stream()
                        .collect(groupingBy(s -> s.grade,
                                mapping(s -> s.name, toList())));

        System.out.println("\nStudents grouped by grade:");
        grouped.forEach((grade, names) ->
                System.out.println(grade + " -> " + names));
    }
}
