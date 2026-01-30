package com.csvdatahandling.modifyfile;
import java.util.*;

public class MainUpdateSalaryCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input CSV path: ");
        String input = sc.nextLine();

        System.out.print("Enter output CSV path: ");
        String output = sc.nextLine();

        SalaryUpdateService service = new SalaryUpdateService();
        service.updateSalary(input, output);
    }
}
