class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx = 0;
        for(int pile:piles)mx = Math.max(mx,pile);
        int low = 1,high = mx,ans=mx;
        while(low <= high){
            int mid = (low + high)/2;
            long total = 0;
            for(int pile:piles){
                total += Math.ceil((double)pile/mid);
            }
            if(total <= h){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
}
