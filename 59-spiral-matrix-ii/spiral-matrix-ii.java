class Solution {
    public int[][] generateMatrix(int n) {
       // List<List<Integer>> ans =  new ArrayList<>();
        int[][] arr= new int[n][n];
         int rs = 0;
        int cs = 0;
        int re = n - 1;
        int ce =  n-  1;
        int end = n*n;
        int data  =  1;
        while(data<=end)
        {
            //left to right
            for( int i = cs; i<=ce; i++)
            {
                arr[rs][i] =  data;
                data++;
            }
            rs++;
            // top to bottom
            for(int  i =  rs; i<=re; i++)
            {
               arr[i][ce] =  data;
               data ++;
            }
            ce--;
            //left to right
            if(rs<=re)
            for(int i = ce; i>=cs; i--)
            {
               arr[re][i] = data;
               data ++;
            }
            re--;
            //bottom to top
            if(cs<=ce)
            for(int i = re;i>=rs;i--)
            {
               arr[i][cs] =  data;
               data ++;
            }
            cs++;
        }
        return arr;

        
    }
}
        
    
