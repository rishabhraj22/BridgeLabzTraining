package com.hashmapshashfunctions.ConsecutiveSequence;
public class LongestConsecutiveTest {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = LongestConsecutiveSequence.findLongestConsecutive(nums);

        System.out.println("Length of Longest Consecutive Sequence: " + result);
    }
}
