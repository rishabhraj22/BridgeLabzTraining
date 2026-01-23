package com.javastreams.bufferedstreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnbufferedFileCopy implements StreamCopyTask {

    private static final int CHUNK_SIZE = 4096;

    @Override
    public long copy(String source, String destination) throws IOException {

        long startTime = System.nanoTime();

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        byte[] buffer = new byte[CHUNK_SIZE];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
