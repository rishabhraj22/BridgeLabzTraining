package com.annotationsandreflection.reflection.jsonrepresentation;

public class Main {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Amit", 30);
        System.out.println(JsonUtil.toJson(p));
    }
}
