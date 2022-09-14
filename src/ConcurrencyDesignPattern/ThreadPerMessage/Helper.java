package ConcurrencyDesignPattern.ThreadPerMessage;

/**
 * @author ankh
 * @created at 2022-09-14 14:03
 */
public class Helper {
    public void handle(int count, char c) {
        System.out.println("   handle(" + count + ", " + c + ") BEGIN");
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(c);
        }
        System.out.println("");
        System.out.println("   handle(" + count + ", " + c + ") END");
    }
}
