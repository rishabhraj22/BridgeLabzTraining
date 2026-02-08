package com.collectors;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.toLowerCase().split("\\W+");

        Map<String, Integer> frequencyMap =
                Arrays.stream(words)
                        .filter(w -> !w.isEmpty())
                        .collect(toMap(
                                w -> w,
                                w -> 1,
                                Integer::sum
                        ));

        System.out.println("\nWord Frequencies:");
        frequencyMap.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }
}
