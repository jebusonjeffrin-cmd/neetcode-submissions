class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solve(root,p,q);
    }
    private TreeNode solve(TreeNode node,TreeNode p,TreeNode q){
        if(node == null)return null;
        if(node == p)return p;
        if(node == q)return q;
        TreeNode left = solve(node.left,p,q);
        TreeNode right = solve(node.right,p,q);
        if(left != null && right != null)return node;
        if(left != null)return left;
        return right;
    }
}
