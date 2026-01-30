package com.csvdatahandling.validation;
import java.util.*;

public class MainValidateCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        new CSVValidator().validate(path);
    }
}
