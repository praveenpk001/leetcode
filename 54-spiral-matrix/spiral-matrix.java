class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rs = 0;
        int cs = 0;
        int re = matrix.length - 1;
        int ce =  matrix[0].length -  1;
        while(rs <= re && cs<= ce)
        {
            //left to right
            for( int i = cs; i<=ce; i++)
            {
                ans.add(matrix[rs][i]);
            }
            rs++;
            // top to bottom
            for(int  i =  rs; i<=re; i++)
            {
                ans.add(matrix[i][ce]);
            }
            ce--;
            //left to right
            if(rs<=re)
            for(int i = ce; i>=cs; i--)
            {
                ans.add(matrix[re][i]);
            }
            re--;
            //bottom to top
            if(cs<=ce)
            for(int i = re;i>=rs;i--)
            {
                ans.add(matrix[i][cs]);
            }
            cs++;
        }
        return ans;

        
    }
}