package com.javastreams.serialisation;
import java.io.IOException;
import java.util.List;

public class EmployeeSerializationApp {

    public static void main(String[] args) {

        EmployeeSerializer serializer =
                new EmployeeSerializer("employees.ser");

        try {
            // Step 1: Read employees from user
            List<Employee> employees = EmployeeInput.readEmployees();

            // Step 2: Serialize
            serializer.saveEmployees(employees);
            System.out.println("\n✅ Employees saved successfully.");

            // Step 3: Deserialize
            List<Employee> loadedEmployees = serializer.loadEmployees();
            System.out.println("\n📄 Employees retrieved from file:");

            for (Employee e : loadedEmployees) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println("❌ I/O Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class not found while reading file.");
        }
    }
}
