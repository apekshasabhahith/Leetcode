class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        // Step 1: Cyclic Sort
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find mismatch
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }
}