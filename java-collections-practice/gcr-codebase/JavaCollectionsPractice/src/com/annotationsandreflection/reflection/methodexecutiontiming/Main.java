package com.annotationsandreflection.reflection.methodexecutiontiming;

public class Main {
    public static void main(String[] args) throws Exception {

        PerformanceUtil.measure(new TaskRunner());
    }
}
