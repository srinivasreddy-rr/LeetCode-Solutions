class Solution {
    public int[] pivotArray(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        int x = 0;
        int equal = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                x++;
            } else if (arr[i] == k) {
                equal++;
            }
        }
        int l = 0;
        int m = x;
        int r = x + equal;
        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                result[l] = arr[i];
                l++;
            } else if (arr[i] > k) {
                result[r] = arr[i];
                r++;
            } else {
                result[m] = arr[i];
                m++;
            }
        }
        return result;

    }
}