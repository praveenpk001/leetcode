class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencount  = 0;
        int oddcount = 0;
        for( int i:position) 
        if(i%2==0)

        {
            evencount++;
    }
    else
    {
        oddcount++;
    }
    return Math.min(oddcount , evencount);
}}