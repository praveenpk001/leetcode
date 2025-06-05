class Solution {
    public boolean checkXMatrix(int[][] m) {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean d = (i == j) || (i + j == n - 1);
                if (d) {
                    if (m[i][j] == 0) return false;
                } else {
                    if (m[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}
