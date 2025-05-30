class Solution {
    public boolean isPalindrome(Integer x) {
        String o = Integer.toString(x);
        String r = new StringBuilder (o).reverse().toString();
        return o.equals(r);
    }
}