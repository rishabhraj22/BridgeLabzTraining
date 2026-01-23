package com.javastreams.pipedstreams;
import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {

    private PipedInputStream input;

    public ReaderThread(PipedInputStream input) {
        this.input = input;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Reader error: " + e.getMessage());
        }
    }
}
