class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,new ArrayList<>(),0);
        return ans;
    }
    private void backtrack(int[] nums,List<Integer> ls,int idx){
        ans.add(new ArrayList<>(ls));
        for(int i=idx;i<nums.length;i++){
            ls.add(nums[i]);
            backtrack(nums,ls,i+1);
            ls.removeLast();
        }
    }
}
