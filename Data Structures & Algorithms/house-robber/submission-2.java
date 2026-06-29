class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(nums,0,dp);
    }
    private int rob(int[] nums,int n,int[] dp){
        if(n>=nums.length)return 0;
        if(dp[n] != -1)return dp[n];
        int pick = nums[n] + rob(nums,n+2,dp);
        int nopick = rob(nums,n+1,dp);
        return dp[n] = Math.max(pick,nopick);
    }
}
