package com.annotationsandreflection.reflection.createobject;

public class Main {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("reflection.basic4.Student");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Student s = (Student) obj;
        s.show();
    }
}
