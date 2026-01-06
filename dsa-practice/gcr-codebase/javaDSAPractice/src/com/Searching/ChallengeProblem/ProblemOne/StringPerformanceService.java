package com.Searching.ChallengeProblem.ProblemOne;
public class StringPerformanceService {

    public long testStringBufferPerformance(int n) {
        StringBuffer sb = new StringBuffer();

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long testStringBuilderPerformance(int n) {
        StringBuilder sb = new StringBuilder();

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }
}
