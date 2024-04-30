package Abstract;

public class Child extends Parent {

    public Child(int age) {
        super(age);
    }

    @Override
    public void career() {
        System.out.println("in im  career");
    }

    @Override
    void Partner() {
        System.out.println("Im in Partner");
    }

}
