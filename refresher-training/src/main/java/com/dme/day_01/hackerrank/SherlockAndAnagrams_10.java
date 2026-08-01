package com.dme.day_01.hackerrank;

import java.util.*;

public class SherlockAndAnagrams_10 {

    public static int sherlockAndAnagrams(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){

            for(int j = i+1; j <= s.length(); j++){

                String subString1 = s.substring(i, j);

                for(int k = i+1; k < s.length(); k++){

                    for(int l = k+1; l <= s.length(); l++){

                        String subString2 = s.substring(k, l);

                        if(subString1.length() == subString2.length()){
                            char[] a = subString1.toCharArray();
                            char[] b = subString2.toCharArray();
                            Arrays.sort(a);
                            Arrays.sort(b);

                            if(Arrays.equals(a, b)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < a; i++) {
            String s = sc.nextLine();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
    }
}