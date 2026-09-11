class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return solve(p,q);
    }
    private boolean solve(TreeNode p , TreeNode q){
        if(p == null && q != null || p != null && q == null)return false;
        if(p == null && q == null)return true;
        if(p.val != q.val)return false;
        boolean left = solve(p.left , q.left);
        boolean right = solve(p.right,q.right);
        return left && right;
    }
}
