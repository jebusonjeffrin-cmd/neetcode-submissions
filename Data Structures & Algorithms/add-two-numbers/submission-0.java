/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode ans = result;
        ListNode t1 = l1,t2 = l2;
        int cf=0;
        while(t1 != null || t2 != null || cf != 0){
            int v1 = (t1 != null)?t1.val:0;
            int v2 = (t2 != null)?t2.val:0;

            int res = v1 + v2 + cf;
            cf = res / 10;
            res = res % 10;
            ans.next = new ListNode(res);
            ans = ans.next;
            t1 = (t1 != null)?t1.next:null;
            t2 = (t2 != null)?t2.next:null; 
        }
        return result.next;
    }
}
