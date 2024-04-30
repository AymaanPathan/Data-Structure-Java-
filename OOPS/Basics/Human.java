package Basics;

public class Human {
    String Name;
    int age;
    int salary;
    static int population;

    public Human(String name, int age, int salary) {
        this.Name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;
    }
}
