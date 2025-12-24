public class SubstringOccurrences {

    public static void main(String[] args) {

        // Declaring string and substring
        String str = "abababab";
        String sub = "ab";
        int count = 0;

        // Looping through string to match substring
        for (int i = 0; i <= str.length() - sub.length(); i++) {

            // Checking substring match
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        // Printing number of occurrences
        System.out.println("Occurrences: " + count);
    }
}
