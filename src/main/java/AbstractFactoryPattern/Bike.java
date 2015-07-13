package AbstractFactoryPattern;

public class Bike extends Mechanism {

    @Override
    void drive() {
        System.out.println("I'm driving a bike");
    }

    @Override
    void stop() {
        System.out.println("I've just stopped a bike");
    }
}
