package singely;

public class Main {
    public static void main(String[] args) {
        Practice list = new Practice();
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);
        list.insert(4, 3);
        // System.out.println(list.DeleteHead());
        // System.out.println(list.DeleteTail());
        System.out.println(list.deleteIndex(0));
        list.display();
    }
}
