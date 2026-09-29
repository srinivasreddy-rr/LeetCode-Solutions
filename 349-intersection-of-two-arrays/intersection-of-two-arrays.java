class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < m; i++) {
            set2.add(nums2[i]);
        }

        for (int element : set1) {
            if (set2.contains(element)) {
                ans.add(element);
            }
        }
      return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}