package com.annotationsandreflection.annotations.customcachingsystem;

public class MathService {

    @CacheResult
    public int square(int n) {
        System.out.println("Computing square...");
        return n * n;
    }
}
