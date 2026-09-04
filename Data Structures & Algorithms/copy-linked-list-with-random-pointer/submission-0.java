class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> mp = new HashMap<>();
        mp.put(null,null);

        Node temp = head;
        while(temp != null){
            Node copy = new Node(temp.val);
            mp.put(temp,copy);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            Node copy = mp.get(temp);
            copy.next = mp.get(temp.next);
            copy.random = mp.get(temp.random);
            temp = temp.next;
        }

        return mp.get(head);
    }
}
