package creational.singleton;

public class MediaContract extends Thread {

    public void run() {
        getSingletons();
    }

    public void getSingletons() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        DoubleCheckedLocking doubleCheckedLocking = DoubleCheckedLocking.getInstance();
        System.out.println("Eager " + eagerSingleton.toString());
        System.out.println("Thread-Safe " + threadSafeSingleton.toString());
        System.out.println("Double checked " + doubleCheckedLocking.toString());
    }

    public static void main(String args[]) {
        MediaContract thread01 = new MediaContract();
        thread01.start();
        MediaContract thread02 = new MediaContract();
        thread02.start();
        MediaContract thread03 = new MediaContract();
        thread03.start();
    }

}
