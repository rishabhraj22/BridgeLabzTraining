package com.stackqueue.SlidingWindow;
import java.util.Arrays;

public class SlidingWindowTest {

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Window size: " + k);

        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
    }
}
