package Template;

/**
 * @author ankh
 * @created at 2022-09-07 15:42
 */
public abstract class AbstractDisplay {
    protected String display = "";
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final String display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
        return display;
    }

}