package com.csvdatahandling.jsoncsv;
import java.util.*;

public class MainJsonCsv {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        JsonCsvConverter conv = new JsonCsvConverter();

        System.out.print("Enter JSON input path: ");
        String json = sc.nextLine();

        System.out.print("Enter CSV output path: ");
        String csv = sc.nextLine();

        conv.writeCsv(csv, conv.readJson(json));

        System.out.print("Enter JSON output path (from CSV): ");
        String back = sc.nextLine();

        conv.csvToJson(csv, back);

        System.out.println("JSON ↔ CSV conversion done!");
    }
}
