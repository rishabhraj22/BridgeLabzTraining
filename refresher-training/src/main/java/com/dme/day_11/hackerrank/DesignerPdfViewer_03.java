package com.dme.day_11.hackerrank;

import java.util.*;

public class DesignerPdfViewer_03 {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            maxHeight = Math.max(maxHeight, h.get(index));
        }
        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> h = new ArrayList<>();
        System.out.print("Enter 26 heights: ");
        for (int i = 0; i < 26; i++) {
            h.add(sc.nextInt());
        }
        System.out.print("Enter word: ");
        String word = sc.next();
        int result = designerPdfViewer(h, word);
        System.out.println("Highlighted area: " + result);
    }
}