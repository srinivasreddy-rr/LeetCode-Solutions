class Solution {
    public String firstPalindrome(String[] word) {
      int n = word.length;
    String ans = "";
    for(int i = 0;i<n;i++){
        int p = word[i].length();
        int r = p-1;
        int l = 0; 
        boolean palindrome = true;
        while(l<=r){
            if(word[i].charAt(l) != word[i].charAt(r)){
               palindrome = false;
               break;
            }
            else{
                System.out.println("");
            }
           l++;
            r--;
        }
        if(palindrome){
            ans = word[i];
            break;
        } 
    }
    return ans;
    }
}