package com.javastreams.readlargefile;
public class ErrorLineFilter {

    public boolean containsError(String line) {
        return line.toLowerCase().contains("error");
    }
}
