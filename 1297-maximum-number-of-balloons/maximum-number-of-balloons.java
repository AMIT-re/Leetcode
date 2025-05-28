class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        char arr[]={'b','a','l','o','n'};
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],0);
        }
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
        }
        hm.put('l',hm.get('l')/2);
        hm.put('o',hm.get('o')/2);

        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.min(max,hm.get(arr[i]));   
        }
        return max;
        
    }
}