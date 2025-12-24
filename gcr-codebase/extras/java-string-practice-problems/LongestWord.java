public class LongestWord {

    public static void main(String[] args) {

        // Declaring sentence variable
        String sentence = "Java is a powerful programming language";

        // Splitting sentence into words
        String[] words = sentence.split(" ");

        // Assuming first word as longest
        String longest = words[0];

        // Looping through words to find longest
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Printing the longest word
        System.out.println("Longest word: " + longest);
    }
}
