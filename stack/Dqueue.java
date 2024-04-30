import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue {
    public static void deque() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println(deque);
    }

    public static void main(String[] args) {
        deque();
    }
}
