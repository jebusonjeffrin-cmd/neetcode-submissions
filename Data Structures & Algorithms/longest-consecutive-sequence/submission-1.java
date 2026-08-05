class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int num:nums)st.add(num);
        int n = nums.length;
        if(n==0)return 0;
        int mx = 1;
        for(int i=0;i<n;i++){
            if(!st.contains(nums[i]-1)){
                int curr=1;
                while(st.contains(nums[i]+1)){
                    curr++;
                    nums[i]++;
                }
                mx = Math.max(mx,curr);
            }
        }
        return mx;
    }
}
