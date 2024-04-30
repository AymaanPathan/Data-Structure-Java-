package example;

public class Car implements Engine, Brake {

    @Override
    public void brake() {
        System.out.println("I brake like a flash speed");
    }

    @Override
    public void Start() {
        System.out.println("I Start like a flash speed");

    }

    @Override
    public void Stop() {
        System.out.println("I Stop like a flash speed");

    }

    @Override
    public void Acc() {
        System.out.println("I Accelerator like a flash speed");
    }

}
