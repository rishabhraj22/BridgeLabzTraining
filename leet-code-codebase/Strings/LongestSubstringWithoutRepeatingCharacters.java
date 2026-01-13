class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0, maxLength = 0;
        boolean[] charSet = new boolean[128];

        while (end < n) {
            char c = s.charAt(end);
            if (charSet[c]) {
                while (start < end && s.charAt(start) != c) {
                    charSet[s.charAt(start)] = false;
                    start++;
                }
                start++;
            } else {
                charSet[c] = true;
                maxLength = Math.max(maxLength, end - start + 1);
            }
            end++;
        }

        return maxLength;
    }
}