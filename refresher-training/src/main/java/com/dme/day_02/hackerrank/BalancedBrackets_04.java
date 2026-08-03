package com.dme.day_02.hackerrank;

import java.util.*;

public class BalancedBrackets_04 {

    public static String isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{
                if(st.isEmpty()) return "NO";
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return "NO";
                }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            String res = isBalanced(s);
            System.out.println(res);
        }
    }
}