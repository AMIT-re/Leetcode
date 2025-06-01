class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right)
        {
            int a=height[left];
            int b=height[right];
            int l=Math.min(a,b)*(right-left);        
            if(l>area)
            {
                area=l;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
        }
        return area;
        
    }
}