class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num1+num2);
            }else if(s.equals("-")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num2-num1);
            }else if(s.equals("*")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num1*num2);
            }else if(s.equals("/")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num2/num1);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }
}
