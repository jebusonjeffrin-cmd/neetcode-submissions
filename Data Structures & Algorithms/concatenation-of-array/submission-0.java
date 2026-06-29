class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        int i=0;
        for(int j=0;j<2;j++){
            for(int num:nums){
                ans[i] = num;
                i++;
            }
        }
        return ans;
        
    }
}