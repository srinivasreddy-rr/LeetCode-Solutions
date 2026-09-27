class Solution {
    public String firstPalindrome(String[] word) {
        int n = word.length;
        String ans = "";
        for (int i = 0; i < n; i++) {
            String reverse = "";
            int p = word[i].length();
            for (int j = p - 1; j >= 0; j--) {
                reverse += word[i].charAt(j);
            }
            if (word[i].equals(reverse)) {
                ans = word[i];
                break;
            } else {
                System.out.println("");
            }
        }
        return ans;
    }
}