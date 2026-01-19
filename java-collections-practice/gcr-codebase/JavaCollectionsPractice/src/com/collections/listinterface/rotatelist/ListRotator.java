package com.collections.listinterface.rotatelist;
import java.util.*;

public class ListRotator {

    // Rotate list to the LEFT by k positions
    public static List<Integer> rotateLeft(List<Integer> list, int k) {
        int n = list.size();
        List<Integer> rotated = new ArrayList<>();

        k = k % n; // handle k > size

        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }
}
