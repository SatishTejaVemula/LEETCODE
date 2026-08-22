class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int s = 0;
        int p = 1;
        while (temp > 0) 
        {
            int digit = temp % 10;
            s += digit;
            p *= digit;
            temp /= 10;
        }
        return n % (s + p) == 0;
    }
}