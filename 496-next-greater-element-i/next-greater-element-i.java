class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //int[] ans=new int[nums1.length];
        Deque<Integer> st=new ArrayDeque<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
             while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
             }
            if(st.size()<0){
                mp.put(nums2[i],-1);

            }
            else if(!st.isEmpty() && nums2[i]<st.peek()){
                mp.put(nums2[i],st.peek());

            }
            else{
                mp.put(nums2[i],-1);
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=mp.get(nums1[i]);
        }
        return nums1;
    }
}