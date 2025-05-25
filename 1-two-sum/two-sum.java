class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (hm.containsKey(complement)) {
                // Found the two indices that sum to target
                return new int[] { hm.get(complement), i };
            }

            // Store value and its index
            hm.put(nums[i], i);
        }
        
        // No solution found (as per constraints, this won't happen)
        return new int[] {};
    }
}
