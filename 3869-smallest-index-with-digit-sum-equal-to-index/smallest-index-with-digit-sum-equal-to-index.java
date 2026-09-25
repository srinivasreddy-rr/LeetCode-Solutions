class Solution {
    public int smallestIndex(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (arr[i] > 0) {
                sum += arr[i] % 10;
                arr[i] = arr[i] / 10;
            }
            if (i == sum) {
                min = Math.min(min, i);
            }

        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}