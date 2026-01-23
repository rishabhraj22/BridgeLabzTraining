package com.javastreams.countwords;
import java.util.*;
import java.util.stream.Collectors;

public class TopWordFinder {

    public List<Map.Entry<String, Integer>> getTopWords(Map<String, Integer> map, int limit) {

        return map.entrySet()
                  .stream()
                  .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                  .limit(limit)
                  .collect(Collectors.toList());
    }
}
