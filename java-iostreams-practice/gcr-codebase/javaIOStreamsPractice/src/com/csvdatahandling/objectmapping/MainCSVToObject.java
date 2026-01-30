package com.csvdatahandling.objectmapping;
import java.util.*;

public class MainCSVToObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CSV path: ");
        String path = sc.nextLine();

        StudentMapper mapper = new StudentMapper();
        List<Student> students = mapper.map(path);

        for (Student s : students) {
            s.display();
        }
    }
}
