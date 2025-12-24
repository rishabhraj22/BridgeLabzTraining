public class ReverseString {

    public static void main(String[] args) {

        // Declaring string variable
        String str = "Java";
        String reverse = "";

        // Looping from end to start of the string
        for (int i = str.length() - 1; i >= 0; i--) {

            // Appending characters in reverse order
            reverse = reverse + str.charAt(i);
        }

        // Printing reversed string
        System.out.println("Reversed String: " + reverse);
    }
}
