package com.javastreams.pipedstreams;
import java.io.IOException;

public class PipedStreamApp {

    public static void main(String[] args) {

        try {
            PipeConnector connector = new PipeConnector();

            WriterThread writer =
                    new WriterThread(connector.getOutputStream());

            ReaderThread reader =
                    new ReaderThread(connector.getInputStream());

            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("❌ Pipe setup failed: " + e.getMessage());
        }
    }
}
