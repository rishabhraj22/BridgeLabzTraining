package com.javastreams.bufferedstreams;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopy implements StreamCopyTask {

    private static final int CHUNK_SIZE = 4096;

    @Override
    public long copy(String source, String destination) throws IOException {

        long startTime = System.nanoTime();

        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(destination));

        byte[] buffer = new byte[CHUNK_SIZE];
        int bytesRead;

        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bis.close();
        bos.close();

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
