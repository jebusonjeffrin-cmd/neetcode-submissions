class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minstk;
    public MinStack() {
        this.stk = new Stack<>();
        this.minstk = new Stack<>();
    }
    
    public void push(int val) {
        if(stk.isEmpty() || val <= minstk.peek()){
            minstk.push(val);
        }
        stk.push(val);
    }
    
    public void pop() {
        if(stk.peek().equals(minstk.peek())){
            minstk.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
