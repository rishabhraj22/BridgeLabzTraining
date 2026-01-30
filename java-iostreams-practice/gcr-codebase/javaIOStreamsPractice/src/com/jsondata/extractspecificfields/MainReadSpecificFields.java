package com.jsondata.extractspecificfields;
import com.fasterxml.jackson.databind.*;
import java.io.*;

public class MainReadSpecificFields {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));

        System.out.println("Name: " + root.get("name").asText());
        System.out.println("Email: " + root.get("email").asText());
    }
}
