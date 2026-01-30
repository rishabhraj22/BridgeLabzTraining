package com.jsondata.student;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class MainCreateStudentJson {
    public static void main(String[] args) throws Exception {

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Rishabh");
        student.put("age", 22);
        student.put("subjects", Arrays.asList("Java", "DSA", "SQL"));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(student);

        System.out.println(json);
    }
}
