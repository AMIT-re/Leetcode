class Solution {
    public int singleNumber(int[] nums) {
        int tmep=0;int i=0;int j=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    tmep++;
                }
            }
            if(tmep<2)
            {
                break;
            }
            tmep=0;
        }
        return nums[i];
        
    }
}