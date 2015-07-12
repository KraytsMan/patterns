package PrototypePattern;

public class CloneTest {

    public static void main(String[] args) {

        CloneFactory factory = new CloneFactory();
        Stormtrooper stormtrooper = new Stormtrooper();

        Stormtrooper stormtrooper2 = (Stormtrooper)factory.getClone(stormtrooper);

        System.out.println("Stormtrooper identity = " + System.identityHashCode(stormtrooper));
        System.out.println("Stormtrooper2 identity = " + System.identityHashCode(stormtrooper2));
    }
}
