package com.runtimeanalysisandbigonotation.StringConcatenation;
public class StringConcatUsingStringBuilder {

    public static String concatenate(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb.toString();
    }
}
