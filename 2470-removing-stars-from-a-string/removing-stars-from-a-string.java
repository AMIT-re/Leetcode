class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='*')
            {
                st.pop();
            }
            else
            {
                st.push(ch);
                
            }
        }
        for(int i=0;i<st.size();i++)
        {
            sb.append(st.get(i));
        }
        return sb.toString();
        
    }
}