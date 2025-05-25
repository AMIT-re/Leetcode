class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int high=nums.length-1;
        int low=0;
        while(low<=high)
        {
            int middle=(low+high)/2;
            if(nums[middle]==target)
            {
                return middle;
            }
            else if(nums[middle]<target)
            {
                low=middle+1;
            }
            else 
            {
                high=middle-1;   
            }
        }

        return low ;
        
        
    }
}