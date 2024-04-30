package polymorphism;

public class overloading {
    int sum(int a, int b) { // name is same order is differnt as compare to 👇 method
        return a + b; // same same but different
    }

    int sum(int a, int b, int c) { // name is same order is differnt as compare to 👆 method
        return a + b + c; // same same but different
    }

    public static void main(String[] args) {
        overloading obj1 = new overloading();
        System.out.println(obj1.sum(0, 0));
    }
}
