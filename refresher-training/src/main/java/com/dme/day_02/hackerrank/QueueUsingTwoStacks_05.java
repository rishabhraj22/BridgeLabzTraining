package com.dme.day_02.hackerrank;

import java.util.*;

public class QueueUsingTwoStacks_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<Integer> stNew = new Stack<>();
        Stack<Integer> stOld = new Stack<>();

        while(q-- > 0){
            int type = sc.nextInt();
            if(type == 1){
                int x = sc.nextInt();
                stNew.push(x);
            } else{
                if(stOld.isEmpty()){
                    while(!stNew.isEmpty()){
                        stOld.push(stNew.pop());
                    }
                }
                if(type == 2){
                    stOld.pop();
                } else{
                    System.out.println(stOld.peek());
                }
            }
        }
    }
}