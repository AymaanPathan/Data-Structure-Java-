package Questions;

public class Question2 {
    private Node head;
    private Node tail;
    private int size;

    Question2() {
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

    public static void merge(Question2 first, Question2 second) {
        Question2 ans = new Question2();
        Node f = first.head;
        Node s = second.head;

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
        }
        while (s != null) {
            ans.insertLast(s.value);
        }
    }

    public static Question2 merges(Question2 first, Question2 second) {
        Question2 ans = new Question2();
        Node f = first.head;
        Node s = second.head;
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
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
        Question2 first = new Question2();
        Question2 second = new Question2();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

        Question2 ans = Question2.merges(first, second);
        ans.display();

    }
}
