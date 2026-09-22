class Solution {
    public int[] pivotArray(int[] arr, int k) {
        int n = arr.length;
    int[] nums1 = new int[n];
    int[] nums2 = new int[n];
    int[] nums3 = new int[n];
    int[] result = new int[n];
    int x = 0;
int y = 0;
int z = 0;
int p = 0;
    for(int i = 0;i<n;i++){
        if(arr[i] < k){
            nums1[x] = arr[i];
            x++;
        }
        else if(arr[i] > k){
            nums2[y] = arr[i];
            y++;
        }
        else{
         nums3[z] = arr[i];
         z++;
        }
    }
    for(int i = 0; i < x; i++){
    result[p] = nums1[i];
    p++;
}
for(int i = 0; i < z; i++){
    result[p] = nums3[i];
    p++;
}
for(int i = 0; i < y; i++){
    result[p] = nums2[i];
    p++;
}
return result;

    }
}