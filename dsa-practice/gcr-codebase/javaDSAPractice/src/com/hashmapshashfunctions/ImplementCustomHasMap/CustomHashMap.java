package com.hashmapshashfunctions.ImplementCustomHasMap;
import java.util.ArrayList;

public class CustomHashMap<K, V> {

    private ArrayList<HashNode<K, V>> bucketArray;
    private int numBuckets;
    private int size;

    // Constructor
    public CustomHashMap() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;   // default capacity
        size = 0;

        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    // Hash function
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % numBuckets);
    }

    // Put (Insert / Update)
    public void put(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Check if key already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at head
        size++;
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = bucketArray.get(bucketIndex);
        bucketArray.set(bucketIndex, newNode);
    }

    // Get value by key
    public V get(K key) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    // Remove key
    public V remove(K key) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        HashNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }

        // Key not found
        if (head == null) {
            return null;
        }

        size--;

        // Remove node
        if (prev != null) {
            prev.next = head.next;
        } else {
            bucketArray.set(bucketIndex, head.next);
        }

        return head.value;
    }

    // Size of map
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }
}
