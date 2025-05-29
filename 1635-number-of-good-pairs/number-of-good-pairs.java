class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int like=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=hm.getOrDefault(nums[i],0);
            like=like+count;
            hm.put(nums[i],count+1);
        }
        return like;
    }
}