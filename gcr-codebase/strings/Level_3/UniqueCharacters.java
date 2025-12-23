import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // index out of bounds
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop for each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create exact sized array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Processing
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Output
        System.out.print("\nUnique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
