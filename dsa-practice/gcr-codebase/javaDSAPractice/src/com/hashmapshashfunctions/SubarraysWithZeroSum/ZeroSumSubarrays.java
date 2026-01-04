package com.hashmapshashfunctions.SubarraysWithZeroSum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {

    // Method to find all zero-sum subarrays
    public static List<String> findZeroSumSubarrays(int[] arr) {

        // Map to store cumulative sum and list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        int sum = 0;

        // Handle case where subarray starts from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }
}
