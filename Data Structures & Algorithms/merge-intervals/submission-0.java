class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++){
            if(ans.isEmpty() || intervals[i][0] > ans.getLast()[1]){
                ans.add(intervals[i]);
            }else{
                ans.getLast()[1] = Math.max(ans.getLast()[1],intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
