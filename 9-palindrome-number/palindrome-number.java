class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;

        }
        if(x==0)
        {
            return true;
        }
        int n=x;
        int rev=0;
        while(n!=0)
        {  
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev!=x)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
}