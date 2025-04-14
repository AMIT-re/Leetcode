class Solution
 {
    public int majorityElement(int[] nums) 
    {
        int mang=nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>mang)
            {
                return nums[i];
            }
        }
        return -1;
    }
}