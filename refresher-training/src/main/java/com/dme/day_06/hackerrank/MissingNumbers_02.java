package com.dme.day_06.hackerrank;

import java.util.*;

public class MissingNumbers_02 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        TreeMap<Integer, Integer> freqB = new TreeMap<>();
        for(int x : brr){
            freqB.put(x, freqB.getOrDefault(x, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(int key : freqB.keySet()){
            int first = firstOccurrence(arr, key);
            int last = lastOccurrence(arr, key);
            int freqA = 0;
            if(first != -1){
                freqA = last - first + 1;
            }
            if(freqA != freqB.get(key)){
                result.add(key);
            }
        }
        return result;
    }

    private static int firstOccurrence(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size()-1;
        int ans = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr.get(mid) == target){
                ans = mid;
                right = mid - 1;
            } else if(arr.get(mid) < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }

    private static int lastOccurrence(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size()-1;
        int ans = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr.get(mid) == target){
                ans = mid;
                left = mid + 1;
            } else if(arr.get(mid) < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> brr = new ArrayList<>();
        for(int i = 0; i < m; i++){
            brr.add(sc.nextInt());
        }
        List<Integer> result = missingNumbers(arr, brr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}