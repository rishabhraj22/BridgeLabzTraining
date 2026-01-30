package com.csvdatahandling.jsoncsv;
import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    public List<Student> readJson(String path) throws Exception {
        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String json = br.readLine();
        br.close();

        json = json.replace("[", "").replace("]", "");
        String[] objects = json.split("\\},\\{");

        for (String obj : objects) {
            obj = obj.replace("{", "").replace("}", "");
            String[] fields = obj.split(",");

            int id = Integer.parseInt(fields[0].split(":")[1]);
            String name = fields[1].split(":")[1].replace("\"", "");
            int age = Integer.parseInt(fields[2].split(":")[1]);

            list.add(new Student(id, name, age));
        }
        return list;
    }

    public void writeCsv(String path, List<Student> list) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write("ID,Name,Age");
        bw.newLine();

        for (Student s : list) {
            bw.write(s.id + "," + s.name + "," + s.age);
            bw.newLine();
        }
        bw.close();
    }

    public void csvToJson(String csvPath, String jsonPath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(csvPath));
        br.readLine();
        String line;

        StringBuilder json = new StringBuilder("[");
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            json.append("{\"id\":").append(d[0])
                .append(",\"name\":\"").append(d[1])
                .append("\",\"age\":").append(d[2]).append("},");
        }
        br.close();

        json.deleteCharAt(json.length() - 1);
        json.append("]");

        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonPath));
        bw.write(json.toString());
        bw.close();
    }
}
