package com.functionalinterface.dataexport;
import java.util.Scanner;

public class ReportExportMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Export Type: 1.CSV  2.PDF");
        int choice = sc.nextInt();

        ReportExporter exporter;

        if (choice == 1) {
            exporter = new CSVExporter();
        } else {
            exporter = new PDFExporter();
        }

        exporter.export();
        exporter.exportToJSON();

        sc.close();
    }
}
