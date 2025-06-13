class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
         return 0;
        if (n == 1)
         return nums[0];
        if (n == 2)
         return Math.max(nums[0], nums[1]);
        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1)); 
    }
    private int robLinear(int[] nums, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }
        return curr;
    }
}
