class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) 
        {
            result = rle(result);
        }
        return result;
    }

    private String rle(String s) 
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        while (i < n) 
        {
            char c = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == c) 
            {
                count++;
                i++;
            }
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}