class Solution {
    public int findNonMinOrMax(int[] nums) {
        // if(nums.length <3)
        // return -1;
        // else
         Arrays.sort(nums);
         return nums.length < 3 ? -1 : nums[1];
        
    }
}