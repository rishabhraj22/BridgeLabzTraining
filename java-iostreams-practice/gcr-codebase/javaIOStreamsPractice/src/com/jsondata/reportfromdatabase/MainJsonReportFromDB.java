package com.jsondata.reportfromdatabase;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class MainJsonReportFromDB {
    public static void main(String[] args) throws Exception {

        List<Map<String, Object>> dbData = new ArrayList<>();

        dbData.add(Map.of("id", 1, "name", "Ravi", "salary", 50000));
        dbData.add(Map.of("id", 2, "name", "Neha", "salary", 65000));

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dbData)
        );
    }
}
