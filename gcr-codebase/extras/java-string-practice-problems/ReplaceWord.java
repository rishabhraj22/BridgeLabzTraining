public class ReplaceWord {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        // Splitting sentence into words
        String[] words = sentence.split(" ");
        String result = "";

        // Looping through words
        for (String word : words) {

            // Replacing old word with new word
            if (word.equals(oldWord)) {
                result = result + newWord + " ";
            } else {
                result = result + word + " ";
            }
        }

        // Returning modified sentence
        return result.trim();
    }

    public static void main(String[] args) {

        // Declaring sentence
        String sentence = "Java is fun";

        // Printing replaced sentence
        System.out.println(replaceWord(sentence, "fun", "powerful"));
    }
}
