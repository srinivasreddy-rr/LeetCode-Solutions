class Solution {
    public String reversePrefix(String s, int k) {
        int l = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        char temp = ' ';
        int r = k - 1;
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return new String(arr);
    }
}