package com.jsondata.validateusingjackson;
import com.fasterxml.jackson.databind.*;
import java.io.*;

public class MainValidateJson {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("data.json"));
            System.out.println("JSON is valid ✅");
        } catch (Exception e) {
            System.out.println("Invalid JSON ❌");
        }
    }
}
