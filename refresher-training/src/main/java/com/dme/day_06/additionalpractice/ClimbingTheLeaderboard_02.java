package com.dme.day_06.additionalpractice;

import java.util.*;

public class ClimbingTheLeaderboard_02 {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> unique = new ArrayList<>();
        for (int score : ranked) {
            if (unique.isEmpty() || unique.get(unique.size() - 1) != score) {
                unique.add(score);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int score : player) {
            int index = binarySearch(unique, score);
            result.add(index + 1);
        }
        return result;
    }

    private static int binarySearch(List<Integer> arr, int score) {
        int start = 0;
        int end = arr.size() - 1;
        int answer = arr.size();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) <= score) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ranked = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ranked.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> player = new ArrayList<>();
        for(int i = 0; i < m; i++){
            player.add(sc.nextInt());
        }
        List<Integer> result = climbingLeaderboard(ranked, player);
        for(int rank : result){
            System.out.println(rank);
        }
    }
}