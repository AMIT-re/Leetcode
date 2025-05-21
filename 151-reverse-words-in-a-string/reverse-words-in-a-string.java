class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String c[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=c.length-1;i>=0;i--)
        {
            if(i!=0)
            {
                sb.append(c[i]+" ");
            }
            else
            {sb.append(c[i]);}
        }
        return sb.toString();        
    }
}