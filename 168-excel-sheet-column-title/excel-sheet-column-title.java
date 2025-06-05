class Solution {
    public String convertToTitle(int num)
    {
        StringBuilder t = new StringBuilder();
        while (num > 0) 
        {
            num--;  
            int rem = num % 26;
            char letter = (char) ('A' + rem);
            t.insert(0, letter);
            num = num / 26;
        }

        return t.toString();
    }
}
