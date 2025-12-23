import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequencies and returning as 2D array
    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        // Counting frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Counting unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch];
            }
        }

        // Creating 2D array for result
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Reseting frequency array and filling result
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Processing
        String[][] frequencyTable = findCharacterFrequency(text);

        // Output
        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");

        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" +
                               frequencyTable[i][1]);
        }

        sc.close();
    }
}
