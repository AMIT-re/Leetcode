class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            if(str.isEmpty()==true)
            {
                str.push(s1);
            }
            else if(s1=='{' || s1=='[' || s1=='(' )
            {
                str.push(s1);
            }
            else if(s1=='}' && str.peek()=='{')
            {
                str.pop();
            }
            else if(s1==')' && str.peek()=='(')
            {
                str.pop();
            }
            else if(s1==']' && str.peek()=='[')
            {
                str.pop();
            }
            else 
            {
                return false;
            }
        }
        if(str.isEmpty())
        {
            return true;
        }
        else 
        {
            return false;
        }

        
    }
}