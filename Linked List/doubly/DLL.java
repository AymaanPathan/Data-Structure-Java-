package doubly;

public class DLL {
    private Node head;

    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public void reverse() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            last = temp;
            temp = temp.next;
        }
        ;
        while (last != null) {
            System.out.print(last.value + " => ");
            last = last.prev;
        }
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
