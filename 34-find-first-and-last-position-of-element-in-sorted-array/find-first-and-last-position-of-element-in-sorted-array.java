class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=-1;int e=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {   s=i;
                break;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==target)
            {
                e=j;
            }
        }
        return new int[]{s,e};
        
    }
}