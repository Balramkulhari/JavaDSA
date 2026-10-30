class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int index = 0;
        int highest = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i]>highest){
                highest = nums[i];
                index = i;
            }
        }
        return index;   
    }
}