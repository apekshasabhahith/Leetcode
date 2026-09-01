class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(k<=0||k>nums.length){
            return -1;
        }
        else{
            Arrays.sort(nums);
            return nums[nums.length-k];
        }
        
    }
}