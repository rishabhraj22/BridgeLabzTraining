package com.jsondata.filter;
import com.fasterxml.jackson.databind.*;
import java.io.*;

public class MainFilterUsers {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("users.json"));

        for (JsonNode node : root) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
