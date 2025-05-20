class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(hm.contains(nums[i]))
            {
                return true;
            }
            else
            {
                hm.add(nums[i]);
            }
        }
        return false;
    }
}