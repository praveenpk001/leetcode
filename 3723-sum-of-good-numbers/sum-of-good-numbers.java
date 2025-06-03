class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean a=true;
            if(i-k>=0 && nums[i] <= nums[i-k])
             a=false;
            if(i+k<nums.length && nums[i] <= nums[i+k])
             a = false;
            if(a)
             sum += nums[i];
        }
        return sum;
    }
}