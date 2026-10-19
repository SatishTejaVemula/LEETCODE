class Solution {
    public int minRotations(String s) {
        int current = 0;
        int rotations = 0;
        for (char c : s.toCharArray()) 
        {
            int next = c - '0';
            int distance = Math.abs(current - next);
            rotations += Math.min(distance, 10 - distance);
            current = next;
        }
        return rotations;
    }
}