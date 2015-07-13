package AbstractFactoryPattern;

public class Car extends Mechanism {
    @Override
    void drive() {
        System.out.println("I'm driving a car");
    }

    @Override
    void stop() {
        System.out.println("I've just stopped a car");
    }
}
