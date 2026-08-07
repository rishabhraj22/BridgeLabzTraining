package com.dme.day_06.hackerrank;

import java.util.*;

public class Pairs_03 {

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            int target = arr.get(i)+k;
            if(binarySearch(arr, target)){
                count++;
            }
        }
        return count;
    }

    private static boolean binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size()-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr.get(mid) == target){
                return true;
            } else if(arr.get(mid) < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        int result = pairs(k, arr);
        System.out.println(result);
    }
}