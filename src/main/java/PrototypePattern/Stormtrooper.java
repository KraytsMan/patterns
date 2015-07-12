package PrototypePattern;


public class Stormtrooper implements Clone {

    public Stormtrooper() {
        System.out.println("The Empire does what is necessary.");
    }

    public Clone makaClone() {
        System.out.println("You fought two Jedi at once? I don't believe that!");

        Stormtrooper stormtrooper = null;

        try {
            stormtrooper = (Stormtrooper)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return stormtrooper;
    }
}
