package com.Searching.StringBuffer.StringPerformance;
public class StringPerformanceService {

    public long testStringBufferPerformance(int n) {
        StringBuffer sb = new StringBuffer();

        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long testStringBuilderPerformance(int n) {
        StringBuilder sb = new StringBuilder();

        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
