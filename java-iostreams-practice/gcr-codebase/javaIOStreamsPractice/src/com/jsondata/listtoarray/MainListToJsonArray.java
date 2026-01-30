package com.jsondata.listtoarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class MainListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<User> list = new ArrayList<>();
        list.add(new User(1, "Amit", 23));
        list.add(new User(2, "Neha", 28));
        list.add(new User(3, "Ravi", 30));

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list)
        );
    }
}
