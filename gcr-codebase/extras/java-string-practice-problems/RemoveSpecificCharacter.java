public class RemoveSpecificCharacter {

    public static void main(String[] args) {

        // Declaring string and character to remove
        String str = "Hello World";
        char remove = 'l';
        String result = "";

        // Looping through string characters
        for (int i = 0; i < str.length(); i++) {

            // Adding character if it is not the one to remove
            if (str.charAt(i) != remove) {
                result = result + str.charAt(i);
            }
        }

        // Printing modified string
        System.out.println("Modified String: " + result);
    }
}
