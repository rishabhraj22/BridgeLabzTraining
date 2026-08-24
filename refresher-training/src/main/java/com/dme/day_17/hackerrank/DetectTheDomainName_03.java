package com.dme.day_17.hackerrank;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DetectTheDomainName_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> domains = new TreeSet<>();
        String regex = "https?://(?:www\\d*\\.)?([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                domains.add(matcher.group(1));
            }
        }
        System.out.println(String.join(";", domains));
    }
}
