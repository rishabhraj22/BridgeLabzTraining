package com.collections.setinterface.setequality;
import java.util.*;

public class SetEqualityChecker {

    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        // Approach 1 (recommended): built-in equals
        return set1.equals(set2);
    }
}
