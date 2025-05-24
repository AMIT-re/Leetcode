class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String ch= words[i];
            for(int j=0;j<ch.length();j++)
            {
                if(ch.charAt(j)==x)
                {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
        
    }
}