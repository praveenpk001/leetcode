
class Solution {
    public int uniquePathsWithObstacles(int[][] b) {
        int m = b.length, n = b[0].length;
        int[] a = new int[n];
        a[0] = b[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {
                    a[j] = 0;
                } else if (j > 0) {
                    a[j] += a[j - 1];
                }
            }
        }
        return a[n - 1];
    }
}
