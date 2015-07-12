package AbstractFactoryPattern;


public class Builder implements MachineFactory {
    public Car createCar() {
        return new FordMustang();
    }

    public Ship createShip() {
        return new Titanic();
    }
}
