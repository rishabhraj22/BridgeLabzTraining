package com.jsondata.csvtojson;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class MainCsvToJson {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        String header = br.readLine();
        String[] keys = header.split(",");

        List<Map<String, String>> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < keys.length; i++) {
                map.put(keys[i], values[i]);
            }
            list.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list)
        );
    }
}
