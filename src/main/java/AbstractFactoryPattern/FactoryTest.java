package AbstractFactoryPattern;


public class FactoryTest {
    public static void main(String[] args)
    {
        Car car = new Builder().createCar();
        car.drive();
        car.stop();

        Ship ship = new Builder().createShip();
        ship.outToSea();
        ship.iFeltSomething();
    }
}
