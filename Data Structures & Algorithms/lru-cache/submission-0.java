class LRUCache {
    class Node{
        int key,val;
        Node next,prev;
        public Node(int key,int val){
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
      //Key  . Next node
    Map<Integer,Node> mp;
    int capacity;
    private Node head;
    private Node tail;
    public void addLast(Node node){
        Node prev = tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next = tail;
        tail.prev = node;
    }
    public void remove(Node node){
        Node prev = node.prev;
        Node nxt  = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mp = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            remove(node);
            addLast(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int val) {
        if(mp.containsKey(key))remove(mp.get(key));

        Node node = new Node(key,val);
        mp.put(key,node);
        addLast(node);

        if(mp.size() > capacity){
            Node lru = head.next;
            remove(lru);
            mp.remove(lru.key);
        }
    }
}
