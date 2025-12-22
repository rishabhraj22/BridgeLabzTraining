import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to return characters without using toCharArray()
    public static char[] getCharactersUsingCharAt(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the string: ");
        String text = sc.next();

        // User-defined method
        char[] userDefinedArray = getCharactersUsingCharAt(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Comparing both arrays
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Displaying results
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    }
}
