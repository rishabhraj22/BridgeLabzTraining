package com.dme.day_01.hackerrank;

import java.util.*;

public class BirthdayCakeCandles_03 {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);

        // finding tallest candle
        for(int height : candles){
            if(height > max){
                max = height;
            }
        }

        int count = 0;

        // counting tallest candles
        for(int height : candles){
            if(height == max){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();

        for(int i = 0; i<n; i++){
            candles.add(sc.nextInt());
        }

        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
}