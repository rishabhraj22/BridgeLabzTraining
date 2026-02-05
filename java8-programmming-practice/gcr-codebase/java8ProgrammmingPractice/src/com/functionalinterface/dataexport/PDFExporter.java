package com.functionalinterface.dataexport;
public class PDFExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report in PDF format");
    }
}
