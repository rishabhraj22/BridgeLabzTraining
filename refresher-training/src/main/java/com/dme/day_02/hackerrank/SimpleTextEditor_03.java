package com.dme.day_02.hackerrank;

import java.util.*;

public class SimpleTextEditor_03 {

    static class Operation {
        int type;
        String value;

        Operation(int type, String value){
            this.type = type;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Operation> stack = new Stack<>();

        while(q-- > 0){
            int type = sc.nextInt();

            if(type == 1){
                String word = sc.next();
                sb.append(word);
                stack.push(new Operation(1, word));
            }
            else if(type == 2){
                int k = sc.nextInt();
                String deleted = sb.substring(sb.length() - k);
                stack.push(new Operation(2, deleted));
                sb.delete(sb.length() - k, sb.length());
            }
            else if(type == 3){
                int k = sc.nextInt();
                System.out.println(sb.charAt(k - 1));
            }
            else{
                Operation last = stack.pop();
                if(last.type == 1){
                    sb.delete(sb.length() - last.value.length(), sb.length());
                }
                else{
                    sb.append(last.value);
                }
            }
        }
    }
}