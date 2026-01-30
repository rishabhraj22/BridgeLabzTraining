package com.jsondata.mergetwoobjects;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

public class MainMergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Rishabh");
        obj1.put("age", 22);

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("email", "rishabh@gmail.com");
        obj2.put("city", "Bhopal");

        obj1.setAll(obj2);

        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1)
        );
    }
}
