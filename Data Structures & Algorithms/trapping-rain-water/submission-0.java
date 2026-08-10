class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans=0;
        int[] premax = new int[n];
        int[] sufmax = new int[n];
        premax[0] = height[0];sufmax[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            premax[i] = Math.max(premax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            sufmax[i] = Math.max(sufmax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            ans += Math.min(sufmax[i],premax[i])-height[i];
        }
        return ans;
    }
}
