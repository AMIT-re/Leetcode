import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];

                if (seen.contains(complement)) {
                    // Found a triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet); // Sort to avoid duplicates
                    result.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}

