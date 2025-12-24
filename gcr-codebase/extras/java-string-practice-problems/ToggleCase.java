public class ToggleCase {

    public static void main(String[] args) {

        // Declaring string variable
        String str = "JavaProGRam";
        String result = "";

        // Looping through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Converting uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char) (ch + 32);
            } 
            // Converting lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char) (ch - 32);
            } 
            // Keeping other characters unchanged
            else {
                result = result + ch;
            }
        }

        // Printing toggled string
        System.out.println("Toggled String: " + result);
    }
}
