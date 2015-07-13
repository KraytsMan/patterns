package AbstractFactoryPattern;


public class ShipFactory implements MachinismAbstractFactory {
    public Mechanism createMechanism() {
        return new Ship();
    }
}
