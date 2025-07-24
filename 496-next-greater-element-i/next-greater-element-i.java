class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums2.length];
        Stack<Integer> str=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(str.isEmpty())
            {
                str.push(nums2[i]);
                res[i]=-1;
            }             
            else if(nums2[i]<str.peek())
            {   
                res[i]=str.peek();
                str.push(nums2[i]);
                
            }
            else
            {
                while(!str.isEmpty() && nums2[i]>=str.peek())
                {
                    str.pop();
                }
                if(str.isEmpty())
                {
                    res[i]=-1;
                }
                else{
                res[i]=str.peek();
                }
                str.push(nums2[i]);
            }
        }

        for(int i=0;i<nums1.length;i++)
        {
            int x=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==x)
                {
                    nums1[i]=res[j];
                    break;
                }
            }            
        }

        return nums1;
        
        
    }
}