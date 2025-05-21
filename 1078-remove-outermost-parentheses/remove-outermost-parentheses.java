class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (count > 0) {
                    sb.append(ch); // ✅ use append instead of add
                }
                count++; // increase nesting level
            } else if (ch == ')') {
                count--; // decrease nesting level
                if (count > 0) {
                    sb.append(ch); // ✅ only append if still inside nested group
                }
            }
        }

        return sb.toString();
    }
}
