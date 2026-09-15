class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)return false;
        boolean find = solve(root,subRoot);
        if(find)return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean solve(TreeNode node,TreeNode sub){
        if(node == null && sub == null)return true;
        if(node == null || sub == null || node.val != sub.val)return false;
        return solve(node.left,sub.left) && solve(node.right,sub.right);
    }
}
