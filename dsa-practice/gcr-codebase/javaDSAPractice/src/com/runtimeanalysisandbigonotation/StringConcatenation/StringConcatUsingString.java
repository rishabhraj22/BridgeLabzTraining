package com.runtimeanalysisandbigonotation.StringConcatenation;
public class StringConcatUsingString {

    public static String concatenate(int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + "a";
        }

        return result;
    }
}
