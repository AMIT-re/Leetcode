class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) { 
        int[] res=new int[nums2.length];
        Arrays.fill(res,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()])
            {
                int index=st.pop();
                res[index]=nums2[i];
            }
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            int number=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==number)
                {
                    nums1[i]=res[j];
                }
            }
            
        }
        return nums1;
        
    }
}