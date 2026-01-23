package com.collections.mapinterface.invertmap;
import java.util.*;

public class MapInverter {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {

        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            invertedMap
                    .computeIfAbsent(value, k -> new ArrayList<>())
                    .add(key);
        }

        return invertedMap;
    }
}
