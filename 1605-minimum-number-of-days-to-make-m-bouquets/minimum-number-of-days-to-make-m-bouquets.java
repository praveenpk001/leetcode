class Solution {
    private boolean p(int[] a, int m, int k, int d) {
        int c = 0;
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= d) {
                e++;
            } else {
                e = 0;
            }
            if (e == k) {
                c++;
                e = 0;
            }
            if (c >= m) {
                return true;
            }
        }
        return c >= m;
    }
    public int minDays(int[] a, int m, int k) {
        if (m * k > a.length) {
            return -1;
        }
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for (int x : a) {
            l = Math.min(l, x);
            r = Math.max(r, x);
        }
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (p(a, m, k, mid)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
