class Solution {
    public String smallestPalindrome(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'a']++;
        
        StringBuilder half = new StringBuilder();
        char mid = 0;
        
        for (int i = 0; i < 26; i++) {
            int c = cnt[i];
            if (c % 2 == 1) {
                mid = (char) ('a' + i);
            }
            for (int j = 0; j < c / 2; j++) {
                half.append((char) ('a' + i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(half);
        if (mid != 0) sb.append(mid);
        sb.append(half.reverse());
        
        return sb.toString();
    }
}