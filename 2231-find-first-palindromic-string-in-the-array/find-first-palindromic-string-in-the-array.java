class Solution {
    public String firstPalindrome(String[] word) {
        int n = word.length;
        String ans = "";
        for (int i = 0; i < n; i++) {
            int p = word[i].length();
            String reverse = new StringBuilder(word[i]).reverse().toString();
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