class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stk.isEmpty() && (ch == ')' || ch == ']' || ch == '}'))return false;

            if(ch == '(' || ch == '[' || ch == '{'){
                stk.push(ch);
            }
            else{
                char top = stk.pop();
                if(top == '(' && ch != ')')return false;
                else if(top == '[' && ch != ']')return false;
                else if(top == '{' && ch != '}')return false;
            }
        }
        return stk.isEmpty();
    }
}
