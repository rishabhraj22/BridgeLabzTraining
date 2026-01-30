package com.jsondata.objectsintoarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class MainListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Neha"));
        list.add(new Student(3, "Ravi"));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(list);

        System.out.println(jsonArray);
    }
}
