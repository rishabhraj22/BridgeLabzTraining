package com.runtimeanalysisandbigonotation.RecursiveIterativeFibonacci;
import java.util.Scanner;

public class FibonacciPerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N for Fibonacci: ");
        int n = sc.nextInt();

        // -------- Recursive Fibonacci --------
        long startRecursive = System.nanoTime();
        int recursiveResult = FibonacciRecursive.calculate(n);
        long endRecursive = System.nanoTime();

        System.out.println("\nRecursive Fibonacci Result: " + recursiveResult);
        System.out.println("Recursive Time: " + (endRecursive - startRecursive) + " ns");

        // -------- Iterative Fibonacci --------
        long startIterative = System.nanoTime();
        int iterativeResult = FibonacciIterative.calculate(n);
        long endIterative = System.nanoTime();

        System.out.println("\nIterative Fibonacci Result: " + iterativeResult);
        System.out.println("Iterative Time: " + (endIterative - startIterative) + " ns");
    }
}
