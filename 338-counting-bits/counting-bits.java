class Solution {
    public int[] countBits(int n) {
        int temp[]=new int[n+1];
        for(int i=0;i<temp.length;i++)
        {
            int n1=i;
            int count =0;
            while(n1>0)
            {  
                int d=n1%2;
                if(d==1)
                {
                    count++;
                }
                n1=n1/2;
            }
            temp[i]=count;
        }
        return temp;
    }
}