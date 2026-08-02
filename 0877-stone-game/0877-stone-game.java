class Solution {
    public boolean stoneGame(int[] nums) {
       int n =  nums.length;
        Integer[][] dp = new Integer[n][n];
        boolean m =  solve(nums,0,n-1 ,dp)>=0;
        return m;
        
    }
    private int solve(int[] nums , int i , int j ,Integer[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(i==j ) return dp[i][j]=nums[i];

        int take_i = nums[i] - solve(nums,i+1,j,dp);
        int take_j = nums[j] - solve(nums,i,j-1,dp);
        return dp[i][j]=Math.max(take_i , take_j);
    } 
}