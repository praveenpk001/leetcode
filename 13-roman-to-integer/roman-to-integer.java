class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);

        int result = 0;
        int lastValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int num = value.get(ch);

            if (num < lastValue) {
                result -= num;
            } else {
                result += num;
            }

            lastValue = num;
        }

        return result;
    }
}
