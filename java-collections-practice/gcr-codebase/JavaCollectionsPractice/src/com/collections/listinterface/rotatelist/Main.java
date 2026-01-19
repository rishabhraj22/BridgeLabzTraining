package com.collections.listinterface.rotatelist;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        List<Integer> rotatedList = ListRotator.rotateLeft(list, k);

        System.out.println("Rotated List: " + rotatedList);
    }
}
