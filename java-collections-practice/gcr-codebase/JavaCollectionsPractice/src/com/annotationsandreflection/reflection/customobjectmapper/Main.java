package com.annotationsandreflection.reflection.customobjectmapper;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Rishabh");
        map.put("age", 22);

        User user = ObjectMapperUtil.toObject(User.class, map);
        System.out.println(user);
    }
}
