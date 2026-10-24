class Solution {
    int koikoi(char l) {
        switch (l) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        int i = 0, result = 0;

        while (i < s.length()) {
            int a = koikoi(s.charAt(i));
            int b = (i + 1 < s.length()) ? koikoi(s.charAt(i + 1)) : 0;

            if (a < b) {
                result -= a;
            } else {
                result += a;
            }

            i++;
        }

        return result;
    }
}