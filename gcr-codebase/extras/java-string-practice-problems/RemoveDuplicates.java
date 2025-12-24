public class RemoveDuplicates {

    public static void main(String[] args) {

        // Declaring string variables
        String str = "programming";
        String result = "";

        // Looping through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Checking if character is already present
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        // Printing string without duplicate characters
        System.out.println("String without duplicates: " + result);
    }
}
