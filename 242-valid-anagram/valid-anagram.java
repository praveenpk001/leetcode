class Solution {
    public boolean isAnagram(String a, String b) {
        if (a.length() !=b.length()) {
            return false;
        }
        int[] f = new int[26];
        for (int i = 0; i<a.length();i++) {
            f[a.charAt(i)-'a']++;
            f[b.charAt(i)-'a']--;
        }
        for (int i = 0; i <f.length;i++) {
            if (f[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
