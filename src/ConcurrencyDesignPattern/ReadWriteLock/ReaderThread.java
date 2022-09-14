package ConcurrencyDesignPattern.ReadWriteLock;

/**
 * @author ankh
 * @created at 2022-09-14 13:35
 */
public class ReaderThread extends Thread{
    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while(true) {
                char[] readbuf = data.read();
                System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readbuf));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
