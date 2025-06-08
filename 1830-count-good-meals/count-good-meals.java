class Solution {
    public static int countPairs(int[] arr) {
        int res = 0; int mod = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            for (int j = 0 ; j <=21; j++){
                int k = 1 << j; 
                if(map.containsKey(k - i)){
                    res+= map.get(k - i);
                    res = res % mod;
                } 
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return res;
    }     
}