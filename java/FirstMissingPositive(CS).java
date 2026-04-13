class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;

        // Step 1: Cyclic sort
        while (i < n) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find missing positive
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // Step 3: If all present
        return n + 1;
    }
}