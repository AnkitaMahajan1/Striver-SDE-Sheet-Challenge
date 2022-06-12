//BruteForce- recursive solution- T(C) - exponential
class Solution {
    public int uniquePaths(int m, int n) {
        return unique(n, m ,0, 0);
    }
    public int unique(int n, int m, int i, int j){
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i >= n || j >= m){
            return 0;
        }
        return unique(n, m, i+1, j) + unique(n, m, i, j+1);
    }
}

//Better- dp- T(C) - O(n*m) , S(C) -  O(n*m)
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return countPaths(0, 0, m, n, dp);
	}

	public int countPaths(int i, int j, int m, int n, int[][] dp) {
		// Base cases
		if (i == (m - 1) && j == (n - 1))
			return 1;
		if (i >= m || j >= n)
			return 0;

		// Memoization
		if (dp[i][j] != -1)
			return dp[i][j];

		// Recursive cases
		return dp[i][j] = countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);
    }
}

//optimal - Combinatorics - Ncr- T(C)- O(m-1),S(C) - O(1)
class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n -2;
        int r = m-1;
        double res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (N - r + i)/i;
        }
        return (int)res;
    }
}

