class Solution {
    public int[] topKFrequent(int[] nums, int K) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            q.offer(new int[]{e.getValue(),e.getKey()});
        }
        int[] ans = new int[K];
        int idx = 0;
        while(K>0 && !q.isEmpty()){
            ans[idx++] =  q.poll()[1];
            K--;
        }
        return ans;
    }
}
