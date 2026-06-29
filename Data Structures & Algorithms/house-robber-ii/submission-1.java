class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1)return nums[0];
        int n = nums.length;
        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int last = rob(nums,0,n-1,dp1);
        
        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int first = rob(nums,1,n,dp2);
        
        return Math.max(first,last);
    }
    private int rob(int[] nums,int n,int end,int[] dp){
        if(n>=end)return 0;
        if(dp[n] != -1)return dp[n];
        int pick = nums[n] + rob(nums,n+2,end,dp);
        int nopick = rob(nums,n+1,end,dp);

        return dp[n] = Math.max(pick,nopick);
    }
}
