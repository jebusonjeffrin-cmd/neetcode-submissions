class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length,c=0;
        int[] ans = new int[n-k+1];
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.getFirst() == i-k)dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1){
                ans[c++] = nums[dq.getFirst()];
            }
        }
        return ans;
    }
}
