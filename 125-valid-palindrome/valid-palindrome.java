class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters
        int start = 0, last = s.length() - 1;
        
        while (start < last) {
            if (s.charAt(start) != s.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
