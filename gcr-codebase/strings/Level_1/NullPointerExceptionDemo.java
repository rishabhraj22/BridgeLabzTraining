public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {

        String text = null;
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {

        String text = null;

        try {
            // Accessing String method
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Reason: Attempt to access method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Generating the Exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        // Handling the Exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
