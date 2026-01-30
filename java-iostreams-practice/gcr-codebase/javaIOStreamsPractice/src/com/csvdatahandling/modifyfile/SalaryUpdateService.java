package com.csvdatahandling.modifyfile;
import java.io.*;

public class SalaryUpdateService {

    public void updateSalary(String inputPath, String outputPath) {

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputPath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String line = br.readLine();
            bw.write(line);
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary + (salary * 0.10);
                    data[3] = String.valueOf(salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            System.out.println("Updated CSV created successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
