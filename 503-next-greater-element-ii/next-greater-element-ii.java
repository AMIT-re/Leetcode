class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> str=new Stack<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            str.push(nums[i]);
        }
        int [] res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!str.isEmpty() && nums[i]>=str.peek())
            {
                str.pop();
            }
            if(str.isEmpty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=str.peek();
            }
            str.push(nums[i]);
        }
        return res;
    }
}