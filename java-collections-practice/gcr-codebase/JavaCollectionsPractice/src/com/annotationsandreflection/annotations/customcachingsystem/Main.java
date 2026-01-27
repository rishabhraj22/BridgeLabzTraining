package com.annotationsandreflection.annotations.customcachingsystem;

public class Main {
    public static void main(String[] args) throws Exception {

        MathService service = new MathService();

        System.out.println(CacheProcessor.execute(service, "square", 5));
        System.out.println(CacheProcessor.execute(service, "square", 5)); // cached
        System.out.println(CacheProcessor.execute(service, "square", 6));
    }
}
