package com.csvdatahandling.csvreport;
import java.util.*;

public class EmployeeDAO {

    public List<Employee> fetchEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", "IT", 60000));
        list.add(new Employee(102, "Amit", "HR", 45000));
        list.add(new Employee(103, "Neha", "Finance", 55000));
        list.add(new Employee(104, "Karan", "IT", 70000));

        return list;
    }
}
