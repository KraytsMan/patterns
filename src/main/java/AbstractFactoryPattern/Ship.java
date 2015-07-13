package AbstractFactoryPattern;

public class Ship extends Mechanism {
    @Override
    void drive() {
        System.out.println("I'm driving a ship");
    }

    @Override
    void stop() {
        System.out.println("I've just stopped a ship");
    }
}
