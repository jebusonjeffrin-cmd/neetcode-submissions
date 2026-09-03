class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int remIdx = len-n;
        if(remIdx == 0)return head.next;
        temp = head;
        for(int i=0;i<remIdx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
