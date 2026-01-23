package com.javastreams.datastreams;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentDataReader {

    public Student readStudent(String filePath)
            throws IOException {

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(filePath))) {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            return new Student(roll, name, gpa);
        }
    }
}
