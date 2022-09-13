package ConcurrencyDesignPattern.GuardedSuspension;

import java.util.Random;

/**
 * @author ankh
 * @created at 2022-09-12 16:28
 */
public class ServeThread extends Thread{
    private final RequestQueue requestQueue;
    private final Random random;

    public ServeThread(String name, RequestQueue requestQueue, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Request request = requestQueue.getRequest();
                System.out.println(Thread.currentThread().getName() + " precess " + request);
                Thread.sleep(random.nextInt(1000));
            }
        }catch (InterruptedException e) {

        }
    }

}
