class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
       List<Integer> ans = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}