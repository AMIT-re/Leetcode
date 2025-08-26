class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int arr[]=new int[n];
        int i=0;int j=nums.length;
        while(i<nums.length && j<n)
        {
            arr[i]=nums[i];
            arr[j]=nums[i];
            i++;
            j++;
        }
        return arr;
        
        
    }
}