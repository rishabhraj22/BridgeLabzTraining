package com.Searching.StringBuilder.ReverseString;
public class ReverseStringService {

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
}
