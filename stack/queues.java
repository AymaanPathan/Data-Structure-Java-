import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void queue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12); // first in line [peek]
        queue.add(13); // second in line
        queue.add(14); // third in line
        queue.add(15); // fourth in line
        System.out.println(queue.peek());
    }

    public static void main(String[] args) {
        queue();
    }
}
