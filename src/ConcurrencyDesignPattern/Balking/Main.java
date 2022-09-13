package ConcurrencyDesignPattern.Balking;

/**
 * @author ankh
 * @created at 2022-09-13 14:22
 */
public class Main {
    public static void main(String[] args) {
        var data = new Data("./src/ConcurrencyDesignPattern/Balking/out", "(empty)", false);
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
