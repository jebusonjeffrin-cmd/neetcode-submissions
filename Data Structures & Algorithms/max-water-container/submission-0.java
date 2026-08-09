class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int mxarea = 0;
        while(i<j){
            int height = Math.min(heights[i],heights[j]);
            int len = j-i;
            mxarea = Math.max(mxarea,height * len);
            if(heights[i] > heights[j])j--;
            else i++;
        }   
        return mxarea;
    }
}
