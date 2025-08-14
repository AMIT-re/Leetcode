class Solution {
    public String largestGoodInteger(String num) {
        // If the number string is shorter than 3 characters, no good integer is possible.
        if (num.length() < 3) {
            return "";
        }

        // Initialize a character to keep track of the largest "good" digit found.
        // We use a non-digit character like a space to signify that no good digit has been found yet.
        char maxGoodDigit = ' ';

        // Loop through the string. The loop condition i <= num.length() - 3
        // ensures we can safely check for a three-character substring.
        for (int i = 0; i <= num.length() - 3; i++) {
            char currentDigit = num.charAt(i);
            
            // Check if the current three characters are the same.
            if (currentDigit == num.charAt(i + 1) && currentDigit == num.charAt(i + 2)) {
                // We've found a "good" integer. Now we check if it's the largest so far.
                
                // If it's the first good integer we've found, or if the current digit is
                // greater than the max found so far.
                // We can directly compare characters because '9' > '8' > ... > '0'.
                if (maxGoodDigit == ' ' || currentDigit > maxGoodDigit) {
                    maxGoodDigit = currentDigit;
                }
            }
        }

        // After the loop, check if we found any good integer.
        if (maxGoodDigit != ' ') {
            // If we did, construct and return the string of three repeated digits.
            return "" + maxGoodDigit + maxGoodDigit + maxGoodDigit;
        } else {
            // If no good integer was found, return an empty string.
            return "";
        }
    }
}