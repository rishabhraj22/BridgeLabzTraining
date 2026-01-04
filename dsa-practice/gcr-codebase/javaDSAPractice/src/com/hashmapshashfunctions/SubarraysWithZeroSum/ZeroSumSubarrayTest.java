package com.hashmapshashfunctions.SubarraysWithZeroSum;
public class ZeroSumSubarrayTest {

    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        System.out.println("Zero Sum Subarrays:");

        for (String subarray : ZeroSumSubarrays.findZeroSumSubarrays(arr)) {
            System.out.println(subarray);
        }
    }
}
