class Solution {
    public double minimumAverage(int[] arr) {
        int n = arr.length;
        float[] avg = new float[n / 2];
        float min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int i = 0;
        while(i<n/2){
          avg[i] = (float)(arr[i] + arr[n - i - 1]) / 2;
        min = Math.min(min, avg[i]);
        i++;
       }
        return min;
    }
}