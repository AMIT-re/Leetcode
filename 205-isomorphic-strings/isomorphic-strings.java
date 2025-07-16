class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;

        }
        int n=s.length();
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char chars=s.charAt(i);
            char chart=t.charAt(i);
            if(!hm.containsKey(chars))
            {
                if (!hm.containsValue(chart)) 
                {
                    hm.put(chars,chart);
                }
                else
                {
                    return false;
                }
                
            }
            if(hm.containsKey(chars))
            {
                if(hm.get(chars)!=chart)
                {
                    return false;
                }
            }
       
            
        }

        return true;
        
        
    }
}