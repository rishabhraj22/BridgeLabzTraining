public class CountVowelsConsonants {

    public static void main(String[] args) {
		
		//Declaring variables to store string
        String str = "Hello World";
        int vowels = 0, consonants = 0;
        
		// Converting to lowercase
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Checking if the character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
		
		// Printing the number of vowels and consonants
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
