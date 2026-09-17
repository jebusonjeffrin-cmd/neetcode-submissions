class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();

                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
                ls.add(curr.val);
            }
            ans.add(ls);
        }
        return ans;
    }
}
