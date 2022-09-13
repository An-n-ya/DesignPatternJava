package ConcurrencyDesignPattern.Immutable;

/**
 * @author ankh
 * @created at 2022-09-12 14:32
 */
public class PrintPersonThred extends Thread{
    private Person person;
    public PrintPersonThred(Person person) {
        this.person = person;
    }
    @Override
    public void run() {
        int cnt = 100;
        while (cnt > 0) {
            System.out.println(Thread.currentThread().getName() + " prints" + person);
            cnt--;
        }
    }
}
