class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n / 2];
        int[] arr2 = new int[n / 2];
        int[] result = new int[n];
        int p = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                arr1[p] = arr[i];
                p++;
            } else {
                arr2[q] = arr[i];
                q++;
            }
        }
        for (int i = 0; i < n / 2; i++) {

            result[2 * i] = arr1[i];

            result[2 * i + 1] = arr2[i];
        }
        return result;
    }
}