package com.annotationsandreflection.annotations.uncheckedwarnings;

import java.util.ArrayList;

public class UncheckedExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // raw type
        list.add("Java");
        list.add(100);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
