import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count character frequencies
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Processing
        boolean result = isAnagram(text1, text2);

        // Output
        if (result) {
            System.out.println("\nThe given texts are ANAGRAMS.");
        } else {
            System.out.println("\nThe given texts are NOT anagrams.");
        }

        sc.close();
    }
}
