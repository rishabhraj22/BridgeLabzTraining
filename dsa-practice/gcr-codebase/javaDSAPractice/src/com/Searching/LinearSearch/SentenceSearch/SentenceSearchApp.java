package com.Searching.LinearSearch.SentenceSearch;
import java.util.Scanner;

public class SentenceSearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        SentenceSearchService service = new SentenceSearchService();
        String result = service.findSentenceContainingWord(sentences, word);

        if (!result.equals("Not Found")) {
            System.out.println("Sentence found: " + result);
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
