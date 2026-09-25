class Solution {
    public int countPairs(List<Integer> arr, int target) {
        int n = arr.size();
        int pair = 0;
        for(int i = 0;i<n;i++){
          for(int j = i+1;j<n;j++){
           if(arr.get(i) + arr.get(j) < target){
            pair++;
           }
          }
        }
        return pair;
    }
}