package com.collections.insurancemanagement;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Map<String, Policy> hashMap = new HashMap<>();        // fast lookup
    private Map<String, Policy> linkedMap = new LinkedHashMap<>();// insertion order
    private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>(); // sorted by expiry

    public void addPolicy(Policy p) {
        hashMap.put(p.getPolicyNumber(), p);
        linkedMap.put(p.getPolicyNumber(), p);

        treeMap.computeIfAbsent(p.getExpiryDate(), k -> new ArrayList<>()).add(p);
    }

    // 1. Retrieve policy by number
    public Policy getPolicyByNumber(String number) {
        return hashMap.get(number);
    }

    // 2. Policies expiring in next 30 days
    public void expiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        treeMap.subMap(now, true, limit, true)
               .values()
               .forEach(list -> list.forEach(System.out::println));
    }

    // 3. Policies for a policyholder
    public void policiesByHolder(String name) {
        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // 4. Remove expired policies
    public void removeExpired() {
        LocalDate now = LocalDate.now();

        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(now));
        linkedMap.values().removeIf(p -> p.getExpiryDate().isBefore(now));
        treeMap.headMap(now).clear();
    }

    public void showInsertionOrder() {
        linkedMap.values().forEach(System.out::println);
    }
}
