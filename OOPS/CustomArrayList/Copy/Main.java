package Copy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human me = new Human(12, "aymaan");
        Human twin = (Human) me.clone();

        System.out.println(me.age);
    }
}
