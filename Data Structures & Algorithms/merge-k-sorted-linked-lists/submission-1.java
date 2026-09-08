class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(ListNode Node: lists){
            while(Node != null){
                q.offer(Node.val);
                Node = Node.next;
            }
        }   
        while(!q.isEmpty()){
            temp.next = new ListNode(q.poll());
            temp = temp.next;
        }
        return ans.next;
    }
}
