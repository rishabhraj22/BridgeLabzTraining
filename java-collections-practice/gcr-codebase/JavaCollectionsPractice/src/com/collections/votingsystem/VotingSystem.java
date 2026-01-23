package com.collections.votingsystem;
import java.util.*;

public class VotingSystem {

    private Map<String, Integer> voteMap = new HashMap<>();          // fast count
    private Map<String, Integer> insertionOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedResult = new TreeMap<>();

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        insertionOrder.put(candidate, voteMap.get(candidate));
    }

    public void displayResults() {
        sortedResult.putAll(voteMap);

        System.out.println("\n--- Voting Results (Sorted) ---");
        sortedResult.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public void displayInsertionOrder() {
        System.out.println("\n--- Vote Insertion Order ---");
        insertionOrder.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
