class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int sum = 0;
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list1.add(nums[i]);
        }
        for(int i=min;i<max;i++){
            if(!list1.contains(i)){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return new ArrayList<>();
        }

        return list;
    }
}