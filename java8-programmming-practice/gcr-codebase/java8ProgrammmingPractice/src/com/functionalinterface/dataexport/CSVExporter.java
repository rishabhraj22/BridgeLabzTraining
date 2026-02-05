package com.functionalinterface.dataexport;
public class CSVExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report in CSV format");
    }
}
