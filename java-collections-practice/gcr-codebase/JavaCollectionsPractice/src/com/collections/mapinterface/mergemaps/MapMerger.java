package com.collections.mapinterface.mergemaps;
import java.util.*;

public class MapMerger {

    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.put(
                    entry.getKey(),
                    result.getOrDefault(entry.getKey(), 0) + entry.getValue()
            );
        }

        return result;
    }
}
