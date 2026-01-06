package com.Searching.StringBuffer.StringConcatenation;
public class StringConcatenationService {

    public String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
