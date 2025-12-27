public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Looping through characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            // Getting current character from first string
            char c = strs[0].charAt(i);

            // Comparing this character with the same position in other strings
            for (int j = 1; j < strs.length; j++) {

                // Checking if index exceeds string length or characters do not match
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If all characters match, returning the first string
        return strs[0];
    }
}
