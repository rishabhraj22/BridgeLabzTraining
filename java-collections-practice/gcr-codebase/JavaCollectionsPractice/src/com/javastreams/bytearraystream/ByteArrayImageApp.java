package com.javastreams.bytearraystream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayImageApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source image path: ");
        String sourceImage = sc.nextLine();

        System.out.print("Enter output image path: ");
        String outputImage = sc.nextLine();

        ImageToByteArrayConverter converter =
                new ImageToByteArrayConverter();
        ByteArrayToImageWriter writer =
                new ByteArrayToImageWriter();
        ImageComparator comparator =
                new ImageComparator();

        try {
            byte[] imageBytes = converter.convertToBytes(sourceImage);
            writer.writeImage(imageBytes, outputImage);

            boolean identical =
                    comparator.areImagesIdentical(sourceImage, outputImage);

            if (identical) {
                System.out.println("✅ Images are identical. Conversion successful.");
            } else {
                System.out.println("⚠️ Images are different.");
            }

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
