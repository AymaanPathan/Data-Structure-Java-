package Basics;

public class innerClass {
    static class Test {
        int age;

        Test(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Test aymaan = new Test(1);
        Test Rahul = new Test(2);
        System.out.println(aymaan.age);
        System.out.println(Rahul.age);
    }
}
