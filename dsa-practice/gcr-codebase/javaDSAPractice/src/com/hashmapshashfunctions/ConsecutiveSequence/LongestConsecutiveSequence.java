package com.hashmapshashfunctions.ConsecutiveSequence;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    // Method to find the longest consecutive sequence length
    public static int findLongestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {

            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
