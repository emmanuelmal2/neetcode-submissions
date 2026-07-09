class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] alphabet = new int[26];
        
       
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < sChars.length; i++) {
            alphabet[sChars[i] - 'a']++;
        }

        for (int i = 0; i < tChars.length; i++) {
            alphabet[tChars[i] - 'a']--;
            if (alphabet[tChars[i] - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}