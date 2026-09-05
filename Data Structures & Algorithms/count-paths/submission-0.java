class Solution {
    public int uniquePaths(int R, int C) {
        int[][] dp = new int[R][C];
        dp[0][0]=1;
        for(int rw=1;rw<R;rw++)dp[rw][0] = 1;
        for(int cl=1;cl<C;cl++)dp[0][cl] = 1;

        for(int rw=1;rw<R;rw++){
            for(int cl=1;cl<C;cl++){
                dp[rw][cl] = dp[rw-1][cl] + dp[rw][cl-1];
            }
        }
        return dp[R-1][C-1];
    }
}
