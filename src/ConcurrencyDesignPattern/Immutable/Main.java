package ConcurrencyDesignPattern.Immutable;

/**
 * @author ankh
 * @created at 2022-09-12 14:32
 */
public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alaska");
        Person bob = new Person("Bob", "Brazil");
        new PrintPersonThred(alice).start();
        new PrintPersonThred(bob).start();
        new PrintPersonThred(alice).start();
    }
}
