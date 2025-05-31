class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            hm.put(magazine.charAt(i), hm.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!hm.containsKey(ch) || hm.get(ch) <= 0) {
                return false;
            }
            hm.put(ch, hm.get(ch) - 1);
        }

        return true;
    }
}
