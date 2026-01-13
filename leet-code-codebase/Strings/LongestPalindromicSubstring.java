class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length palindrome (center is at i)
            int len1 = expandAroundCenter(s, i, i);
            
            // Case 2: Even-length palindrome (center is between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            // If we found a longer palindrome, update the start and end indices
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }

    /**
     * Helper function to expand from a center and find the length of the palindrome.
     */
    private int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        
        // Expand as long as the pointers are in bounds and characters match
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        
        // Return the length of the palindrome found
        return R - L - 1;
    }
}