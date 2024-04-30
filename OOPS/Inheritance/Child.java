package Inheritance;

public class Child extends Parent {
    String name;

    Child(String name, String Land, int factory, int plots) {
        super(Land, factory, plots);
        this.name = name;
        System.out.println("Child Block");
    }

}