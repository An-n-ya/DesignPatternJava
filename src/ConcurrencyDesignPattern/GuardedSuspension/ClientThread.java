package ConcurrencyDesignPattern.GuardedSuspension;

import java.util.Random;

/**
 * @author ankh
 * @created at 2022-09-12 16:28
 */
public class ClientThread extends Thread{
    private final Random random;
    private final RequestQueue requestQueue;

    public ClientThread(String name, RequestQueue requestQueue, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                Request request = new Request("No." + i);
                System.out.println(Thread.currentThread().getName() + " requests " + request);
                requestQueue.putRequest(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (Exception e) {

        }
    }
    
}
