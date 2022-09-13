package ConcurrencyDesignPattern.GuardedSuspension;

/**
 * @author ankh
 * @created at 2022-09-12 16:28
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        var alice = new ClientThread("Alice", requestQueue, 1234567L);
        var bob = new ServeThread("Bob", requestQueue, 567L);
        alice.start();
        bob.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("******* interrupted ********");
        alice.interrupt();
        bob.interrupt();

    }
}
