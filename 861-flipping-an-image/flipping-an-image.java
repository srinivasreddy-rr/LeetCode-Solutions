class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        int top = 0;
        int bottom = arr.length - 1;
        int[][] image = new int[n][n];
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;

            while (l < r) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;

                l++;
                r--;
            }

            for (int k = 0; k < arr[i].length; k++) {

                if (arr[i][k] == 0) {
                    arr[i][k] = 1;
                } else {
                    arr[i][k] = 0;
                }
                image[i][k] = arr[i][k];
            }
            System.out.println();
        }
        return image;
    }
}