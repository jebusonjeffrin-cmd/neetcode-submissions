class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n=nums.length;
    Map<Integer,Integer> mp = new HashMap<>();
    for(int i=0;i<n;i++){
        if(mp.containsKey(target - nums[i])){
            int i1 = i,i2 = mp.get(target - nums[i]);
            return new int[]{(i1<i2)?i1:i2,(i2>i1)?i2:i1};
        }
        mp.put(nums[i],i);
    }
    return null;   
    }
}
