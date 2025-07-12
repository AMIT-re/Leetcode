class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int count =0;int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=hm.getOrDefault(nums[i],0);
            count=count+c;
            hm.put(nums[i],c+1);
        }
        return count;
        
    

        
    }
}