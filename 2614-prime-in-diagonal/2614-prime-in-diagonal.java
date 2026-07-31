class Solution {
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;

    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int m = 0;
        //checking primary
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) m = Math.max(nums[i][i], m);
            if (isPrime(nums[i][n - 1 - i])) m = Math.max(nums[i][n - 1 - i], m);
        }
        return m;
    }
}