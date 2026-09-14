class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int num = 0;
                    if (i != j && j != k && i != k) {
                        if (digits[i] != 0) {
                            if (digits[k] % 2 == 0) {
                                num = digits[i] * 100 + digits[j] * 10 + digits[k];
                                set.add(num);
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < set.size(); i++) {
            ans++;
        }
      return ans;
    }
}