class Solution {
    public int diagonalPrime(int[][] matrix) {
        int n = matrix.length;
        int lp = 0;

        // Primary diagonal
        for (int i = 0; i < n; i++) {
            if (isPrime(matrix[i][i])) {
                lp = Math.max(lp, matrix[i][i]);
            }
        }

        // Secondary diagonal
        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i && isPrime(matrix[i][n - 1 - i])) {
                lp = Math.max(lp, matrix[i][n - 1 - i]);
            }
        }

        return lp;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
