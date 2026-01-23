package com.javastreams.bytearraystream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayToImageWriter {

    public void writeImage(byte[] imageBytes, String outputPath)
            throws IOException {

        ByteArrayInputStream bais =
                new ByteArrayInputStream(imageBytes);

        FileOutputStream fos = new FileOutputStream(outputPath);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
    }
}
