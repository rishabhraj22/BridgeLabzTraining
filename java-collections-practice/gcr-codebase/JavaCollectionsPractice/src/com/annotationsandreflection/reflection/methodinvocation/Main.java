package com.annotationsandreflection.reflection.methodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operation (add / subtract / multiply): ");
        String operation = sc.nextLine();

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        MathOperations obj = new MathOperations();

        Method method = MathOperations.class.getMethod(operation, int.class, int.class);
        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);
    }
}
