package com.javastreams.pipedstreams;
import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {

    private PipedOutputStream output;

    public WriterThread(PipedOutputStream output) {
        this.output = output;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!\nThis is piped stream demo.";

            for (char ch : message.toCharArray()) {
                output.write(ch);
                Thread.sleep(50); // simulate processing delay
            }

            output.close();

        } catch (IOException | InterruptedException e) {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}
