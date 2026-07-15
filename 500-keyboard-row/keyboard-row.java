class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> charRow = new HashMap<>();
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                charRow.put(c, i);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            int row = charRow.get(lower.charAt(0));
            boolean sameRow = true;
            
            for (char c : lower.toCharArray()) {
                if (charRow.get(c) != row) {
                    sameRow = false;
                    break;
                }
            }
            
            if (sameRow) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}