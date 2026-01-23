package com.javastreams.datastreams;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataWriter {

    public void writeStudent(String filePath, Student student)
            throws IOException {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(filePath))) {

            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
        }
    }
}
