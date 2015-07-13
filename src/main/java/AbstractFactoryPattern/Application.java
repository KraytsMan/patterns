package AbstractFactoryPattern;


public class Application {
    public static void main(String[] args)
    {
      Mechanism mechanism = new BikeFactory().createMechanism();
        mechanism.drive();
        mechanism.stop();
      Mechanism mechanism1 = new CarFactory().createMechanism();
        mechanism1.drive();
        mechanism1.stop();
      Mechanism mechanism2 = new ShipFactory().createMechanism();
        mechanism2.drive();
        mechanism2.stop();
    }
}
