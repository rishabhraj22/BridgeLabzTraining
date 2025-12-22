import java.util.Scanner;

public class WordsWithLength2DArray {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Index out of range
        }
        return count;
    }

    // Method to split text into words using charAt()
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

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // Convert int to String
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Spliting words
        String[] words = splitTextManually(text);

        // Creating 2D array
        String[][] table = createWordLengthTable(words);

        // Displaying in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]); // String → Integer
            System.out.println(table[i][0] + "\t\t" + length);
        }

        sc.close();
    }
}
