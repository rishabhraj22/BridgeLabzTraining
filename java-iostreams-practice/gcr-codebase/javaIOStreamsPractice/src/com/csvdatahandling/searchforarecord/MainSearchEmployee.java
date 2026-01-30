package com.csvdatahandling.searchforarecord;
import java.util.*;

public class MainSearchEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employees CSV file path: ");
        String path = sc.nextLine();

        System.out.print("Enter employee name to search: ");
        String name = sc.nextLine();

        EmployeeSearchService service = new EmployeeSearchService();
        service.searchByName(path, name);
    }
}
