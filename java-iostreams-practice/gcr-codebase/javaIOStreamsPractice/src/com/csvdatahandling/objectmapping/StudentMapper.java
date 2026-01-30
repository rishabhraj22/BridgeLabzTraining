package com.csvdatahandling.objectmapping;
import java.io.*;
import java.util.*;

public class StudentMapper {

    public List<Student> map(String path) {

        List<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new Student(
                        Integer.parseInt(d[0]),
                        d[1],
                        Integer.parseInt(d[2])
                ));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return list;
    }
}
