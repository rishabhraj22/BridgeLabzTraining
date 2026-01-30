package com.csvdatahandling.merge;
import java.io.*;
import java.util.*;

public class MainMergeCSV {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students1.csv path: ");
        String p1 = sc.nextLine();

        System.out.print("Enter students2.csv path: ");
        String p2 = sc.nextLine();

        System.out.print("Enter output file path: ");
        String out = sc.nextLine();

        Map<String, String[]> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(p1))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                map.put(d[0], d);
            }
        } catch (Exception e) {}

        try (
            BufferedReader br = new BufferedReader(new FileReader(p2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(out))
        ) {
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] d2 = line.split(",");
                String[] d1 = map.get(d2[0]);

                if (d1 != null) {
                    bw.write(d1[0] + "," + d1[1] + "," + d1[2] + "," + d2[1] + "," + d2[2]);
                    bw.newLine();
                }
            }

            System.out.println("Files merged successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
