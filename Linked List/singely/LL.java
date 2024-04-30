package singely;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) { // insert value
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) { // if only one node is there
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int DeleteHead() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node Get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public int DeleteTail() {
        if (size <= 1) {
            return DeleteHead();
        }
        Node secondLast = Get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            return DeleteHead();
        }
        if (index == size - 1) {
            return DeleteTail();
        }

        Node prev = Get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display() {
        Node temp = head; // iteration
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    private class Node { // Node => a box

        private int value;
        private Node next; // who he is pointing to [next => node2]

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}