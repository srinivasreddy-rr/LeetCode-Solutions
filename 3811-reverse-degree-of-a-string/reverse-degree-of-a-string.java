class Solution {
    public int reverseDegree(String s) {
        String a = "zyxwvutsrqponmlkjihgfedcba";
        int n = s.length();
        int sum = 0;
        int pro = 0;
        for (int i = 0; i < n; i++) {
            int value = a.indexOf(s.charAt(i)) + 1;
            pro = (i + 1) * value;
            sum += pro;
        }
        return sum;
    }
}