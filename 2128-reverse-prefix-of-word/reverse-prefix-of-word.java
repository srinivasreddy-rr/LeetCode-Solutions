class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int l = 0;
        int r = 0;
        char temp = ' ';
        char[] arr = word.toCharArray();
        for (int i = 0; i < n; i++) {
            char s = word.charAt(i);
            if (ch == s) {
                r = i;
                break;
            }

        }
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String result = new String(arr);
        return result;
    }
}