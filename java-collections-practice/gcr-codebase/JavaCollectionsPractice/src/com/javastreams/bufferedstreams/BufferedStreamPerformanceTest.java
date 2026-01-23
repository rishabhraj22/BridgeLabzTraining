package com.javastreams.bufferedstreams;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamPerformanceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file path (large file): ");
        String source = sc.nextLine();

        System.out.print("Enter destination (unbuffered copy): ");
        String dest1 = sc.nextLine();

        System.out.print("Enter destination (buffered copy): ");
        String dest2 = sc.nextLine();

        StreamCopyTask normalCopy = new UnbufferedFileCopy();
        StreamCopyTask bufferedCopy = new BufferedFileCopy();

        try {
            long normalTime = normalCopy.copy(source, dest1);
            long bufferedTime = bufferedCopy.copy(source, dest2);

            System.out.println("\n📊 Performance Comparison");
            System.out.println("Unbuffered Time: " + normalTime / 1_000_000 + " ms");
            System.out.println("Buffered Time  : " + bufferedTime / 1_000_000 + " ms");

            if (bufferedTime < normalTime) {
                System.out.println("✅ Buffered streams are faster");
            } else {
                System.out.println("⚠️ No significant improvement");
            }

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
