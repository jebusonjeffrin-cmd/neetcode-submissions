class Solution {
    public int search(int[] nums, int target) {
        int low = 0,high = nums.length-1,n=nums.length;
        int pivot = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid+1 < n && nums[mid] > nums[mid+1]){
                pivot = mid+1;break;
            }
            if(mid-1 >= 0 && nums[mid] < nums[mid-1]){
                pivot = mid;break;
            }
            if(nums[mid] > nums[high]){ 
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println("pivot -> "+pivot);
        int res = binarySearch(nums,0,pivot-1,target);
        System.out.println("res -> "+res);
        if(res != -1)return res;
        res = binarySearch(nums,pivot,nums.length-1,target);
        return (res == -1)?-1:res;
    }
    private static int binarySearch(int[] nums,int low,int high,int target){
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid] < target)low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
