class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // Normalize mod to handle negative values
            int mod = ((sum % k) + k) % k;

            if (hm.containsKey(mod)) {
                count += hm.get(mod);
            }

            hm.put(mod, hm.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}
