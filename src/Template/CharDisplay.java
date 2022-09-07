package Template;

/**
 * @author ankh
 * @created at 2022-09-07 15:45
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch) {
        super();
        this.ch = ch;
    }

    @Override
    public void open() {
        display += "<<";
    }

    @Override
    public void print() {
        display += ch;
    }

    @Override
    public void close() {
        display += ">>\n";
    }
}
