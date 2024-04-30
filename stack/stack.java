import java.util.Stack;

/**
 * first
 */
public class stack {
    public static void stacking() {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop()); // remove 12
        System.out.println(stack.pop()); // remove 13
        System.out.println(stack.pop()); // remove 14
        System.out.println(stack.pop()); // remove 15
    }

    public static void main(String[] args) {
        stacking();
    }
}