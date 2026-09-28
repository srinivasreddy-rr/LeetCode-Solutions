class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n / 2];
        Arrays.sort(nums);
        int k = 0;
        int i = 0;
        int j = n-1;
        int max = Integer.MIN_VALUE;
       while(i<j){
                if (i + j == n - 1) {
                    arr[k] = nums[i] + nums[j];
                    max = Math.max(max, arr[k]);
                    k++;
    
                }
                i++;
                j--;
       }
            
        
        return max;
    }
}