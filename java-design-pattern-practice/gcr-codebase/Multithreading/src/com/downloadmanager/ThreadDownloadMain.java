package com.downloadmanager;
public class ThreadDownloadMain {

    public static void main(String[] args) {
        System.out.println("Starting downloads using Thread class...\n");

        FileDownloaderThread t1 = new FileDownloaderThread("Document.pdf");
        FileDownloaderThread t2 = new FileDownloaderThread("Image.jpg");
        FileDownloaderThread t3 = new FileDownloaderThread("Video.mp4");

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();

        // Main thread waits for all downloads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("\nAll downloads complete!");
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
