package com.dme.day_02.hackerrank;

import java.util.*;

public class MaximumElement_01 {

    public static List<Integer> getMax(List<String> operations) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> maxSt = new Stack<>();

        List<Integer> ans = new ArrayList<>();

        for(String o : operations){

            String[] parts = o.split(" ");

            int type = Integer.parseInt(parts[0]);

            if(type == 1){

                int value = Integer.parseInt(parts[1]);

                st.push(value);

                if(maxSt.isEmpty() || value >= maxSt.peek()){
                    maxSt.push(value);
                }

            } else if(type == 2){

                int removed = st.pop();

                if(removed == maxSt.peek()){
                    maxSt.pop();
                }

            } else {

                ans.add(maxSt.peek());

            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> ops = new ArrayList<>();

        for(int i = 0; i<n; i++){
            ops.add(sc.nextLine());
        }

        List<Integer> result = getMax(ops);

        for(int num : result){
            System.out.println(num);
        }
    }
}