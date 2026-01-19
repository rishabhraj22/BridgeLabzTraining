package com.collections.listinterface.nthfromend;
import java.util.*;

public class NthFromEndFinder {

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return null; // n is larger than list size
            }
            fast.next();
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
