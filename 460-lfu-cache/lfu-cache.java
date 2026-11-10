
class LFUCache {

    class Node {
        int key, value, freq;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DLL {
        Node head, tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        void add(Node node) {
            Node nextNode = head.next;

            head.next = node;
            node.prev = head;

            node.next = nextNode;
            nextNode.prev = node;

            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size == 0) return null;

            Node node = tail.prev;
            remove(node);

            return node;
        }
    }

    HashMap<Integer, Node> map;
    HashMap<Integer, DLL> freqMap;

    int capacity;
    int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        minFreq = 0;

        map = new HashMap<>();
        freqMap = new HashMap<>();
    }

    void updateFreq(Node node) {

        int oldFreq = node.freq;

        DLL oldList = freqMap.get(oldFreq);
        oldList.remove(node);

        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;

        DLL newList = freqMap.getOrDefault(
            node.freq, new DLL()
        );

        newList.add(node);
        freqMap.put(node.freq, newList);
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        updateFreq(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (capacity == 0) return;

        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;
            updateFreq(node);

            return;
        }

        if (map.size() == capacity) {

            DLL list = freqMap.get(minFreq);

            Node removed = list.removeLast();

            map.remove(removed.key);
        }

        Node node = new Node(key, value);

        DLL list = freqMap.getOrDefault(1, new DLL());

        list.add(node);

        freqMap.put(1, list);
        map.put(key, node);

        minFreq = 1;
    }
}


/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */