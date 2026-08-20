class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stk = new Stack<>();
        int n = t.length;
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && t[i] >= t[stk.peek()]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek() - i;
            }
            stk.push(i);
        }
        return res;
    }
}
