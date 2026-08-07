package com.dme.day_06.hackerrank;

import java.util.*;

public class IceCreamParlor_01 {
    static class Pair {
        int price;
        int index;
        Pair(int price, int index){
            this.price = price;
            this.index = index;
        }
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        int n = arr.size();
        Pair[] pair = new Pair[n];
        for(int i = 0; i < n; i++){
            pair[i] = new Pair(arr.get(i), i + 1);
        }
        Arrays.sort(pair, (a, b) -> a.price - b.price);
        for(int i = 0; i < n; i++){
            int remaining = m - pair[i].price;
            int pos = binarySearch(pair, i + 1, n - 1, remaining);
            if(pos != -1){
                int first = pair[i].index;
                int second = pair[pos].index;
                if(first > second){
                    int temp = first;
                    first = second;
                    second = temp;
                }
                return Arrays.asList(first, second);
            }
        }
        return new ArrayList<>();
    }

    public static int binarySearch(Pair[] pairs, int left, int right, int target) {
        while(left <= right){
            int mid = left+(right-left)/2;
            if(pairs[mid].price == target){
                return mid;
            } else if(pairs[mid].price < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            List<Integer> result = icecreamParlor(m, arr);
            for(int index : result){
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}