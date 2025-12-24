public class AnagramCheck {

    public static void main(String[] args) {

        // Declaring two strings
        String s1 = "listen";
        String s2 = "silent";

        // Checking length condition
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Creating count array
        int[] count = new int[256];

        // Updating frequency count
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        // Checking if all counts are zero
        for (int c : count) {
            if (c != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        // Printing the result
        System.out.println("Anagrams");
    }
}
