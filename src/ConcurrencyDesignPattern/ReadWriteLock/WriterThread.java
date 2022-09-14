package ConcurrencyDesignPattern.ReadWriteLock;

import java.util.Random;

/**
 * @author ankh
 * @created at 2022-09-14 13:35
 */
public class WriterThread extends Thread{
    private static final Random random = new Random();
    private final Data data;
    private final String filler;
    private int index = 0;
    public WriterThread(Data data, String filler) {
        this.data = data;
        this.filler = filler;
    }

    @Override
    public void run() {
        try {
            while (true) {
                char c = nextchar();
                data.write(c);
                Thread.sleep(random.nextInt(3000));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private char nextchar() {
        char c = filler.charAt(index);
        index = (index + 1) % filler.length();
        return c;
    }
}
