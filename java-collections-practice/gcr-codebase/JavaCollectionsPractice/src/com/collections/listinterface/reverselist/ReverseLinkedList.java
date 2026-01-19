package com.collections.listinterface.reverselist;
import java.util.*;

public class ReverseLinkedList {

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }
}
