class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> set1 = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = min; i < max; i++) {
            if (!set.contains(i)) {
                set1.add(i);
            }
        }
        return set1;
    }

}
