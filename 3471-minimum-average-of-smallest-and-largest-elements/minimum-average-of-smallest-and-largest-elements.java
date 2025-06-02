import java.util.*;
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=n-1;
        double minsum=Double.MAX_VALUE;
        while(left<right)
        {
            
            double avg=(nums[left]+nums[right])/2.0;
            minsum=Math.min(minsum,avg);
            left++;
            right--;
        }
        return minsum;
        
    }
}