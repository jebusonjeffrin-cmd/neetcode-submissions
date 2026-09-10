/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

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
