package com.collections.setinterface.settosortedlist;
import java.util.*;

public class SetToSortedListConverter {

    public static List<Integer> convertAndSort(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list); // ascending order
        return list;
    }
}
