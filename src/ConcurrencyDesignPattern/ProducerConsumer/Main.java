package ConcurrencyDesignPattern.ProducerConsumer;

/**
 * @author ankh
 * @created at 2022-09-13 14:43
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", 1, table).start();
        new MakerThread("MakerThread-2", 2, table).start();
        new MakerThread("MakerThread-3", 3, table).start();
        new EaterThread("EaterThread-1", 4, table).start();
        new EaterThread("EaterThread-2", 5, table).start();
        new EaterThread("EaterThread-3", 6, table).start();
    }
}
