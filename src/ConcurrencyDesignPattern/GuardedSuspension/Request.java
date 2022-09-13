package ConcurrencyDesignPattern.GuardedSuspension;

/**
 * @author ankh
 * @created at 2022-09-12 16:27
 */
public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
