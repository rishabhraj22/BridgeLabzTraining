package com.collections.insurancesystem;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // 1. Retrieve all unique policies
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }

    // 2. Policies expiring within 30 days
    public void policiesExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // 3. Policies by coverage type
    public void policiesByCoverage(String type) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // 4. Find duplicate policies by policy number
    public void findDuplicates(List<Policy> list) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }

    // 5. Performance comparison
    public void performanceTest() {
        int n = 100000;
        List<Policy> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            temp.add(new Policy(
                    "P" + i,
                    "User" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Health",
                    1000 + i
            ));
        }

        testSetPerformance("HashSet", new HashSet<>(), temp);
        testSetPerformance("LinkedHashSet", new LinkedHashSet<>(), temp);
        testSetPerformance("TreeSet", new TreeSet<>(), temp);
    }

    private void testSetPerformance(String name, Set<Policy> set, List<Policy> data) {
        long start, end;

        start = System.nanoTime();
        set.addAll(data);
        end = System.nanoTime();
        System.out.println(name + " Add Time: " + (end - start));

        Policy sample = data.get(data.size() / 2);

        start = System.nanoTime();
        set.contains(sample);
        end = System.nanoTime();
        System.out.println(name + " Search Time: " + (end - start));

        start = System.nanoTime();
        set.remove(sample);
        end = System.nanoTime();
        System.out.println(name + " Remove Time: " + (end - start));

        System.out.println("----------------------");
    }
}
