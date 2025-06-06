import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;
        List<List<Integer>> result = new ArrayList<>();
        int[] flat = new int[total];
        int index = 0;
        for (int[] row : grid) {
            for (int val : row) {
                flat[index++] = val;
            }
        }
        int[] shifted = new int[total];
        for (int i = 0; i < total; i++) {
            shifted[(i + k) % total] = flat[i];
        }
        for (int i = 0; i < total; i += n) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(shifted[i + j]);
            }
            result.add(row);
        }

        return result;
    }
}
