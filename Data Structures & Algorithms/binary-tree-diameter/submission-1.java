class Solution {
    static int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        height(root);
        return ans;
    }
    private int height(TreeNode node){
        if(node == null)return 0;

        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right;
        ans = Math.max(ans,dia);
        return 1+Math.max(left,right);
    }
}
