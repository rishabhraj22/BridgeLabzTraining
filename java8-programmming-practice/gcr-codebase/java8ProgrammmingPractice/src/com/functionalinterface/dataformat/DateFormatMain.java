package com.functionalinterface.dataformat;
import java.time.LocalDate;
import java.util.Scanner;

public class DateFormatMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.next();

        System.out.print("Enter format pattern (dd/MM/yyyy): ");
        String pattern = sc.next();

        LocalDate date = LocalDate.parse(inputDate);

        String formattedDate = DateUtils.formatDate(date, pattern);
        System.out.println("Formatted Date: " + formattedDate);

        sc.close();
    }
}
