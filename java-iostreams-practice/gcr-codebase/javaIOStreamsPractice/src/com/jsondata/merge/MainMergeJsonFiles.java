package com.jsondata.merge;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;

public class MainMergeJsonFiles {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = (ObjectNode) mapper.readTree(new File("a.json"));
        ObjectNode json2 = (ObjectNode) mapper.readTree(new File("b.json"));

        json1.setAll(json2);

        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json1)
        );
    }
}
