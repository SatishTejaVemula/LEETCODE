class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int lo = Math.min(start, destination);
        int hi = Math.max(start, destination);
        
        int sum1 = 0, total = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= lo && i < hi) {
                sum1 += distance[i];
            }
        }
        int sum2 = total - sum1;
        return Math.min(sum1, sum2);
    }
}