package com.Searching.LinearSearch.SentenceSearch;
public class SentenceSearchService {

    public String findSentenceContainingWord(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
                return sentences[i]; // return first matching sentence
            }
        }

        return "Not Found"; // if no sentence contains the word
    }
}
