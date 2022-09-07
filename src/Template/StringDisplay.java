package Template;

/**
 * @author ankh
 * @created at 2022-09-07 15:49
 */
public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    private void addLine() {
        var tmp = new StringBuilder();
        tmp.append("+");
        for (int i = 0; i < width; i++) {
            tmp.append("-");
        }
        tmp.append("+\n");
        display += tmp;
    }

    @Override
    public void open() {
        addLine();
    }

    @Override
    public void print() {
        display += ("|" + string + "|\n");
    }

    @Override
    public void close() {
        addLine();
    }
}
