import java.util.Scanner;

public class SplitTextComparison {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception when index goes out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextManually(String text) {

        int length = findLength(text);

        // Counting words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Storing space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extracting words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            String word = "";
            for (int j = start; j < spaceIndexes[i]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }

        // Last word
        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined spliting
        String[] manualSplit = splitTextManually(text);

        // Built-in spliting
        String[] builtInSplit = text.split(" ");

        // Comparing both results
        boolean result = compareStringArrays(manualSplit, builtInSplit);

        // Displaying results
        System.out.println("\nWords using manual method:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}
