package com.hashmapshashfunctions.ImplementCustomHasMap;
public class CustomHashMapTest {

    public static void main(String[] args) {

        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        System.out.println("Value for key A: " + map.get("A"));
        System.out.println("Value for key B: " + map.get("B"));

        map.put("A", 50); // update value
        System.out.println("Updated value for key A: " + map.get("A"));

        map.remove("B");
        System.out.println("Value for key B after removal: " + map.get("B"));

        System.out.println("Current size of map: " + map.size());
    }
}
