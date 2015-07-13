package AbstractFactoryPattern;


public class CarFactory implements MachinismAbstractFactory {
    public Mechanism createMechanism() {
        return new Car();
    }
}
