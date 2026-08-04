class Solution {
    public int dominantIndex(int[] nums) {
        int firstmax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxindex = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]>firstmax){
                secondMax = firstmax;
                firstmax=nums[i];
                maxindex=i;
            }
            else if (nums[i] > secondMax && nums[i] != firstmax) {
                secondMax = nums[i];
            }
        }
        if(firstmax>=secondMax*2) return maxindex;
        return -1;
    }
}