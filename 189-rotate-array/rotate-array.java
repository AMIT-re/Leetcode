class Solution {
    public void rotate(int[] nums, int k) {
        // Get the length of the array
        int n = nums.length;
        // Reduce k if it's larger than the array length
        k = k % n;
        // Reverse the whole array
        reverse(nums, 0, n -1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    // Helper function to reverse a portion of the array in-place
    private void reverse(int[] nums, int start, int end) {
        // Use two pointers to swap elements until the middle is reached
        while (start < end) {
            int temp = nums[start]; // Temporarily store the start element
            nums[start] = nums[end]; // Assign end element to start
            nums[end] = temp; // Assign stored value to end
            start++; // Move start pointer forward
            end--; // Move end pointer backward
        }
    }
}
