class Solution {
    public void moveZeroes(int[] nums) {
        int temp[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                temp[c]=nums[i];
                c++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {

            nums[i]=temp[i];
            
        }
        
        System.out.print("[");
        for(int i=0;i<nums.length;i++)
        {
            
            System.out.print(temp[i]);
            if(i!=nums.length-1)
            {
                System.out.print(",");
            }
            else
            {
                System.out.print("]");
            }
        }
    }
}