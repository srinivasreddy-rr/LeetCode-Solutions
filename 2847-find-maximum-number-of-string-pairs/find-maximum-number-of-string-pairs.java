import java.util.*;
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int l = words.length;
        int ans = 0;

        for (int i = 0; i < l; i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();

            for (int j = i + 1; j < l; j++) {
                if (words[j].equals(rev)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}