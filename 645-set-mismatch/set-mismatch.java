class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[2];
        int dup = 0;
        int missing = 0;
        for(int i =0;i<nums.length;i++)
        {
            int k = nums[i];
            if(!hs.contains(k))
            {
                hs.add(k);
            }
            else
            {
                dup = k;
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                missing = i;
            }
        }
        arr[0] = dup;
        arr[1] = missing;
        return arr;
    }
}