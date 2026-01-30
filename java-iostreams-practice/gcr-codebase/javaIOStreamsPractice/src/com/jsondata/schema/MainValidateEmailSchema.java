package com.jsondata.schema;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.regex.*;

public class MainValidateEmailSchema {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));

        String email = root.get("email").asText();
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (Pattern.matches(regex, email)) {
            System.out.println("Valid email ✅");
        } else {
            System.out.println("Invalid email ❌");
        }
    }
}
