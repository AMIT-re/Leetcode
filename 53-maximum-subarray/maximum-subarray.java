class Solution {
    public int maxSubArray(int[] nums) 
    {   int max1=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max1=Math.max(max1+nums[i],nums[i]);
            res=Math.max(max1,res);
        }
        return res;
    }
}