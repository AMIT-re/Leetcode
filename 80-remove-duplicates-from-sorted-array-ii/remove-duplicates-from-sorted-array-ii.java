class Solution {
    public int removeDuplicates(int[] nums) {
        // int j = 0; // Pointer to track the position to overwrite
        
        // for (int num : nums) {
        //     // If we are at the first 2 elements or the current number is different from nums[j-2]
        //     if (j < 2 || num > nums[j - 2]) {
        //         nums[j++] = num;
        //     }
        // }
        
        // return j; // New length of modified array
        int j =0;
        for(int i=0;i<nums.length;i++)
        {
            if(j<2 || nums[i]!=nums[j-2])
            {
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}