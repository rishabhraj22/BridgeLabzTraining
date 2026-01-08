package com.runtimeanalysisandbigonotation.StringConcatenation;
public class StringConcatUsingStringBuffer {

    public static String concatenate(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb.toString();
    }
}
