package com.collections.listinterface.removeduplicates;
import java.util.*;

public class DuplicateRemover {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer value : list) {
            if (!seen.contains(value)) {
                seen.add(value);
                result.add(value);
            }
        }

        return result;
    }
}
