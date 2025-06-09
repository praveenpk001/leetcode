class Solution
 {
    public boolean canConstruct(String a, String b)
     {
        int[] c = new int[26];
        for (char x : b.toCharArray())
         {
            c[x - 'a']++;
        }
        for (char x : a.toCharArray()) 
        {
            if (c[x - 'a'] == 0) 
            return false;
            c[x - 'a']--;
        }
        return true;
    }
}
