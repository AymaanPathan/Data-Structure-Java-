package Abstract;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    public abstract void career();

    abstract void Partner();

    static void hello() {
        System.out.println("hello");
    }
}
