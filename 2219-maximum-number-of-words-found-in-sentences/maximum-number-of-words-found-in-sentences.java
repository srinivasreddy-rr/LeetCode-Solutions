class Solution {
    public int mostWordsFound(String[] arr) {
       int l = arr.length;
   char w = ' ';
   int word = 0 ;
   int max = 0;
   for(int i = 0;i<l;i++){ 
    int ans = 0;
    String x = arr[i];
    for(int j = 0;j<x.length();j++){
   if(x.charAt(j) == w){
   ans++;
   }
    } word = ans + 1 ;
 if(word > max){
    max = word;
 }
  
   }return max;
    }
}