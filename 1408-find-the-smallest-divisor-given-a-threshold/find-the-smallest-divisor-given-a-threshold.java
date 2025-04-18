class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = getMax(nums);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (getSum(nums, mid) > threshold) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
    
    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }
}