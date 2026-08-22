class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int N = heights.length;
        int maxArea = 0;
        for(int i=0;i<N;i++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                maxArea = Math.max(maxArea,heights[stk.pop()]*(stk.isEmpty()?i:i-stk.peek()-1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int curr = stk.pop();
            if(!stk.isEmpty()){
                int prev = stk.peek();
                maxArea = Math.max(maxArea,(N-1-prev)*heights[curr]);
            }else{
                maxArea = Math.max(maxArea,heights[curr]*N);
            }
        }
        return maxArea;
    }
}
