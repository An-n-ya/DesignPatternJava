package Singleton;

/**
 * @author ankh
 * @created at 2022-09-08 15:48
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}
