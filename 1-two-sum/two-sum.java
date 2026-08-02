class Solution {
    public int[] twoSum(int[] nums, int target) {
        int on = 0;
        int tw = 0;
        int n = nums.length;
        int arr[] = new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    on = i;
                    tw = j;
                }
            }
        }
        arr[0] = on;
        arr[1] = tw;
        return arr;
    }
}