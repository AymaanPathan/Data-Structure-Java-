package AccessModifier;

public class A {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    A(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
