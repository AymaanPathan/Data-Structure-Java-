package Questions;

// package Questions;

public class Question1 {
    private Node head;
    private Node tail;
    private int size;

    Question1() {
        this.size = 0;
    }

    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        node.next = null;
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

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Question1 node = new Question1();
        node.insertFirst(3);
        node.insertFirst(3);
        node.insertFirst(2);
        node.insertFirst(2);
        node.insertFirst(1);
        node.insertFirst(1);
        node.removeDuplicates();
        node.display();

    }
}
