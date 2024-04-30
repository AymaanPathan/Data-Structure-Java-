package Basics;

public class Static {
    static int a = 4;
    static int b;

    static { // static block only runs ones
        System.out.println("Im in static Block");
        b = a * 4;
    }

    public static void main(String[] args) {
        // Static obj1 = new Static();
        System.out.println(Static.a + " " + Static.b);
        System.out.println(Static.a + " " + Static.b);
    }
}
