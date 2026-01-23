package com.javastreams.serialisation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.List;

public class EmployeeSerializer {

    private String filePath;

    public EmployeeSerializer(String filePath) {
        this.filePath = filePath;
    }

    public void saveEmployees(List<Employee> employees) throws IOException {

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeObject(employees);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> loadEmployees()
            throws IOException, ClassNotFoundException {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(filePath));

        List<Employee> employees = (List<Employee>) ois.readObject();
        ois.close();

        return employees;
    }
}
