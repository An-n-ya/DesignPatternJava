package ConcurrencyDesignPattern.ProducerConsumer;

import java.util.Random;

/**
 * @author ankh
 * @created at 2022-09-13 14:43
 */
public class EaterThread extends Thread{
    private final Random random;
    private final Table table;

    public EaterThread(String name, long seed, Table table) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
