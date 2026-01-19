package com.collections.listinterface.reverselist;
import java.util.*;

public class ReverseArrayList {

    public static void reverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
