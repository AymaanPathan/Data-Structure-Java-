package Abstract;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(222);
        child.career();
        child.Partner();
        Child.hello();
        System.out.println(child.age);

    }
}
