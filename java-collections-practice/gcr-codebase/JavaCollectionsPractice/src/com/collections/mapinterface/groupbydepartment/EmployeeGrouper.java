package com.collections.mapinterface.groupbydepartment;
import java.util.*;

public class EmployeeGrouper {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            map
                .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                .add(emp);
        }

        return map;
    }
}
