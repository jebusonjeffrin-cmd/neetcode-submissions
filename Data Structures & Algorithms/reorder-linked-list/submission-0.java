
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        
        ListNode temp = curr,prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        ListNode lh=head,rh=prev;
        ListNode lnxt,rnxt;
        while(rh != null){
            lnxt = lh.next;
            rnxt = rh.next;

            lh.next = rh;
            rh.next = lnxt;

            lh = lnxt;
            rh = rnxt;
        }
    }
}
