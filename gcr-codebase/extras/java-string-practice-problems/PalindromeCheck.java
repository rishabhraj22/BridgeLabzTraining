public class PalindromeCheck {

    public static void main(String[] args) {

        // Declaring string variable
        String str = "madam";
        String reverse = "";

        // Reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Checking if original and reversed strings are equal
        if (str.equals(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
