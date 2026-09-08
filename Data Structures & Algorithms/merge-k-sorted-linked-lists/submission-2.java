class Solution {
    class pair{
    int val;
    ListNode node;
    pair(int val,ListNode node){
        this.val = val;
        this.node = node;
    }
}
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        PriorityQueue<pair> q = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(ListNode Node: lists){
            if(Node != null)q.offer(new pair(Node.val,Node));
        }   
        while(!q.isEmpty()){
            pair curr = q.poll();
            temp.next = curr.node;
            if(curr.node.next != null){
                q.offer(new pair(curr.node.next.val,curr.node.next));
            }
            temp = temp.next;
        }
        return ans.next;
    }
}
