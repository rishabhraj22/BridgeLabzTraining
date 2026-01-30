package com.csvdatahandling.filterrecords;
import java.util.*;

public class MainFilterStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student CSV file path: ");
        String path = sc.nextLine();

        StudentFilterService service = new StudentFilterService();
        service.filter(path);
    }
}
