package com.collections.setinterface.symmetricdifference;
import java.util.*;

public class SetSymmetricDifference {

    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        // Union
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Remove common elements
        result.removeAll(intersection);

        return result;
    }
}
