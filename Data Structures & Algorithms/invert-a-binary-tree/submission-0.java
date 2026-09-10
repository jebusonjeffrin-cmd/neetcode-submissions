class Solution {
    public TreeNode invertTree(TreeNode root) {
        solve(root);
        return root;
    }
    private void solve(TreeNode node){
        if(node == null)return;
        solve(node.left);
        solve(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
