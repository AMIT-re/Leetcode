class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        String s1=word[word.length-1];
        return s1.length();

        
    }
}