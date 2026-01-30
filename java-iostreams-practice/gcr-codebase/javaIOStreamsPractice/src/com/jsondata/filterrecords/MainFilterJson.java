package com.jsondata.filterrecords;
import com.fasterxml.jackson.databind.*;
import java.io.*;

public class MainFilterJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("students.json"));

        for (JsonNode node : root) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
