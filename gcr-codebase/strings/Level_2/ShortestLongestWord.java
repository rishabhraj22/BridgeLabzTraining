import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without using length()
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

    // Method to split text into words using charAt()
    public static String[] splitTextManually(String text) {

        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

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

        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }

        return table;
    }

    // Method to find shortest and longest string and returns index of shortest and longest word
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);
            int shortestLength = Integer.parseInt(table[shortestIndex][1]);
            int longestLength = Integer.parseInt(table[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Processing
        String[] words = splitTextManually(text);
        String[][] table = createWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        // Displaying table
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" +
                    Integer.parseInt(table[i][1]));
        }

        // Displaying shortest & longest
        System.out.println("\nShortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);

        sc.close();
    }
}