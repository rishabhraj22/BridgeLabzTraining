package com.collections.queueinterface.binarynumbersqueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        List<String> binaries =
                BinaryNumberGenerator.generateBinaryNumbers(n);

        System.out.println("First " + n + " binary numbers:");
        System.out.println(binaries);
    }
}
