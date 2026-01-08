package com.runtimeanalysisandbigonotation.ComparingDifferentDataStructures;
import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill all structures
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // -------- Array Search --------
        long startArray = System.nanoTime();
        boolean arrayResult = ArraySearch.search(arr, target);
        long endArray = System.nanoTime();

        System.out.println("\nArray Search Result: " + arrayResult);
        System.out.println("Array Search Time: " + (endArray - startArray) + " ns");

        // -------- HashSet Search --------
        long startHashSet = System.nanoTime();
        boolean hashSetResult = HashSetSearch.search(hashSet, target);
        long endHashSet = System.nanoTime();

        System.out.println("\nHashSet Search Result: " + hashSetResult);
        System.out.println("HashSet Search Time: " + (endHashSet - startHashSet) + " ns");

        // -------- TreeSet Search --------
        long startTreeSet = System.nanoTime();
        boolean treeSetResult = TreeSetSearch.search(treeSet, target);
        long endTreeSet = System.nanoTime();

        System.out.println("\nTreeSet Search Result: " + treeSetResult);
        System.out.println("TreeSet Search Time: " + (endTreeSet - startTreeSet) + " ns");
    }
}
