package com.dme.day_08.hackerrank;

import java.util.*;

public class CoinChange_02 {

    public static long getWays(int n, List<Long> c) {
        long[][] dp = new long[n+1][c.size()];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return rec(n, c, 0, dp);
    }

    public static long rec(int amount, List<Long> coins, int idx, long[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (idx >= coins.size()) {
            return 0;
        }
        if (dp[amount][idx] != -1) {
            return dp[amount][idx];
        }
        long include = rec(amount - coins.get(idx).intValue(), coins, idx, dp);
        long exclude = rec(amount, coins, idx+1, dp);
        dp[amount][idx] = include + exclude;
        return dp[amount][idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> c = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            c.add(sc.nextLong());
        }
        long result = getWays(n, c);
        System.out.println(result);
    }
}