package com.Searching.FileReader.WordCount;
import java.util.Scanner;

public class WordCountApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        WordCountService service = new WordCountService();
        int count = service.countWordOccurrence(filePath, word);

        System.out.println("The word \"" + word + "\" occurred " + count + " times.");

        sc.close();
    }
}
