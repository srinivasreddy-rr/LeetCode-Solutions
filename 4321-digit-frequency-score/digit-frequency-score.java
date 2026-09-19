class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            ans.put(digit, ans.getOrDefault(digit, 0) + 1);
        }
        for (Integer key : ans.keySet()) {
            sum += key * ans.get(key);
        }
        return sum;
    }
}