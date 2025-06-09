class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            int a = map.getOrDefault(n, 0);
            a++;
            if (a == 2) {
                res.add(n);
            }
            map.put(n, a);
        }

        return res;
    }
}
