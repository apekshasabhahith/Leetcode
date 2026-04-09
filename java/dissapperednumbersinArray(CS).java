class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort
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

        // Step 2: Find missing numbers
        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(index + 1);
            }
        }

        return result;
    }
}