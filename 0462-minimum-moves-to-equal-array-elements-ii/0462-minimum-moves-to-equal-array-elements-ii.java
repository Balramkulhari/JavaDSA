class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int moves=0;
        for(int i = 0; i<nums.length/2;i++){
            moves += Math.abs(nums[i]-mid);
            moves += Math.abs(nums[nums.length-i-1]-mid);

        }
        return moves;
    }
}