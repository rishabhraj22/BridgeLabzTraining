package com.Searching.LinearSearch.FirstNegativeSearch;
public class FirstNegativeSearchService {

    public int findFirstNegativeIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // return immediately when found
            }
        }

        return -1; // no negative number found
    }
}
