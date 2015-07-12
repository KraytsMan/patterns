package AbstractFactoryPattern;


public class FordMustang implements Car {
    public void drive() {
        System.out.println("I'm driving Ford Mustang");
    }

    public void stop() {
        System.out.println("I just stopped Ford Mustang");
    }
}
