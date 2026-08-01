class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = nums[i];
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                int Left = nums[i] - arr[i + 1][j];
                int Right = nums[j] - arr[i][j - 1];

                arr[i][j] = Math.max(Left, Right);
            }
        }

        return arr[0][n - 1] >= 0;
    }
}