package com.runtimeanalysisandbigonotation.RecursiveIterativeFibonacci;
public class FibonacciRecursive {

    public static int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}
