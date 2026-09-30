class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> set = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                 for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
            set.add(j);
        }
            }
        }
        return set;
    }

}
