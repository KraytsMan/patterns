package SingletonPattern;

public class SingletonTest {

    public static void main(String[] agrs)
    {
        MySingleton myFirstSingleton = MySingleton.getInstance();
        System.out.println("Singleton's id= "+System.identityHashCode(myFirstSingleton));
        myFirstSingleton.showText("First singleton to show");

        MySingleton mySecondSingleton = MySingleton.getInstance();
        System.out.println("Singleton's id= " + System.identityHashCode(mySecondSingleton));
        myFirstSingleton.showText("Second singleton to show");
    }
}
