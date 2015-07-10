package SingletonPattern;

public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public void showText(String text)
    {
        System.out.println("Singleton's text= "+text);
    }
}
