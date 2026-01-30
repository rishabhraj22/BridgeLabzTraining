package com.csvdatahandling.sortbysalary;
import java.util.*;

public class MainSortEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        EmployeeSortService service = new EmployeeSortService();
        service.sortAndPrintTop5(path);
    }
}
