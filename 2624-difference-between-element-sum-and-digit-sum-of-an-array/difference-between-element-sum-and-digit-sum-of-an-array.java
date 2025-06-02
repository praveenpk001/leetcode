class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        for(int i : nums){
        sum+=i;
        }
        int elementsum =0;
        for(int  i : nums){
            if( i < 10)
            {
                elementsum +=i;

            }
            else
            {
                while(i > 0){

                
                elementsum +=i%10;
                i/=10;
                }
            }

        }
        return sum - elementsum;

    
    }
}