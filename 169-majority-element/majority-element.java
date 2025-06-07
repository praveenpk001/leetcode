class Solution {
    public int majorityElement(int[] a) {
        int c = 0, x = 0;

        for (int n : a) {
            if (c == 0) {
                x = n;
            }
            c += (n == x) ? 1 : -1;
        }

        return x;
    }
}
