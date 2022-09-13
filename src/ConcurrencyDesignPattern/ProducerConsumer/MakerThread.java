package ConcurrencyDesignPattern.ProducerConsumer;

import java.util.Random;

/**
 * @author ankh
 * @created at 2022-09-13 14:43
 */
public class MakerThread extends Thread{
    private final Random random;
    private final Table table;
    private static int id = 0;

    public MakerThread(String name, long seed, Table table) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No." + nextId() + " by " + getName() + " ]";
                table.put(cake);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static synchronized int nextId() {
        return id++;
    }
}
