package AbstractFactoryPattern;

public class BikeFactory implements MachinismAbstractFactory {
    public Mechanism createMechanism() {
        return new Bike();
    }
}
