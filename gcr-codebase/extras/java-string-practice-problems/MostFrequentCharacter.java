public class MostFrequentCharacter {

    public static void main(String[] args) {

        // Declaring string variable
        String str = "success";

        // Creating frequency array
        int[] freq = new int[256];

        // Counting frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Initializing most frequent character
        char mostFrequent = str.charAt(0);
        int max = freq[mostFrequent];

        // Finding character with maximum frequency
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        // Printing most frequent character
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
