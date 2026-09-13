class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        boolean possible = false;
        for (int i = 0; i < n; i++) {
            int j = 0;
            if (j != i) {
                nums2[i] = nums1[i] - nums1[j];
            }
            j++;
            nums2[i] = nums1[i];
            if (nums2[i] % 2 == 0) {
                possible = true;
            } else if (nums2[i] % 2 != 0) {
                possible = true;
            }
        }
        return possible;
    }

}
