package com.hashmapshashfunctions.TwoSumProblem;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Method to find indices of two numbers adding up to target
    public static int[] findTwoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // If no solution found
        return new int[]{-1, -1};
    }
}
