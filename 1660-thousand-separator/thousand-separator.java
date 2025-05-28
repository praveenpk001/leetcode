class Solution {
    public String thousandSeparator(int n) {
        StringBuilder s= new StringBuilder(String.valueOf(n)).reverse();
         int j = 3;
        for(int i =0;i<s.length(); i++)
        if(i == j)
        {
            s.insert(i ,".");
            j = j+4;
        }
        return s.reverse().toString();
        
    }
}