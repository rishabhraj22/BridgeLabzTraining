package com.downloadmanager;
import java.util.Random;

public class FileDownloaderThread extends Thread {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 10) {
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading "
                    + fileName + ": " + progress + "%");
            try {
                // Random delay to simulate actual download time
                Thread.sleep(200 + random.nextInt(400));
            } catch (InterruptedException e) {
                System.out.println("Download interrupted for " + fileName);
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] " + fileName + " download completed.");
    }
}
