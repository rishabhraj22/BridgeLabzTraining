import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find character frequency using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int length = chars.length;

        int[] freq = new int[length];

        // Initializing frequency array
        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        // Nested loop for calculating frequency
        for (int i = 0; i < length; i++) {

            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // marking duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Storing result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
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
        String[] frequencyResult = findCharacterFrequency(text);

        // Output
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");

        for (String s : frequencyResult) {
            System.out.println(s);
        }

        sc.close();
    }
}
