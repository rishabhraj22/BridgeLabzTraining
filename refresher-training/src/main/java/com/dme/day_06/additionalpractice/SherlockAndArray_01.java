package com.dme.day_06.additionalpractice;

import java.util.*;

public class SherlockAndArray_01 {

    public static String balancedSums(List<Integer> arr) {
        int n = arr.size();
        long[] prefix = new long[n];
        prefix[0] = arr.get(0);
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr.get(i);
        }
        long totalSum = prefix[n-1];
        for(int i = 0; i < n; i++){
            long remaining = totalSum - arr.get(i);
            if(remaining%2 != 0){
                continue;
            }
            long target = remaining/2;
            if(i == 0){
                if(target == 0){
                    return "YES";
                }
                continue;
            }
            int index = binarySearch(prefix, target);
            if(index == i-1){
                return "YES";
            }
        }
        return "NO";
    }

    private static int binarySearch(long[] prefix, long target) {
        int start = 0;
        int end = prefix.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(prefix[mid] == target){
                return mid;
            }
            if(prefix[mid] < target){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            String result = balancedSums(arr);
            System.out.println(result);
        }
    }
}
