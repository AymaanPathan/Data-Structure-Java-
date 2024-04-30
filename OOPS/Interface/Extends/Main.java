package Extends;

public class Main implements B {

    @Override
    public void greet() {
        System.out.println("hello");
    }

    @Override
    public void fun() {
        System.out.println("fun");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();
    }

}
