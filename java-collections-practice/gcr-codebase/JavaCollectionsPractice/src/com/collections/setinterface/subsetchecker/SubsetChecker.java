package com.collections.setinterface.subsetchecker;
import java.util.*;

public class SubsetChecker {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}
