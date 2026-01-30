package com.csvdatahandling.validation;
import java.io.*;
import java.util.regex.*;

public class CSVValidator {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public void validate(String path) {

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String header = br.readLine();
            String line;
            int row = 1;

            while ((line = br.readLine()) != null) {
                row++;
                String[] data = line.split(",");

                String email = data[1];
                String phone = data[2];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + row + " invalid email: " + email);
                    valid = false;
                }

                if (!phone.matches("\\d{10}")) {
                    System.out.println("Row " + row + " invalid phone: " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Row Data: " + line);
                    System.out.println("----------------------");
                }
            }

        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
