package Bridge;

/**
 * @author ankh
 * @created at 2022-09-10 15:08
 */
public class StringDisplayImpl implements DisplayImpl{
    private String str;

    public StringDisplayImpl(String str) {
        this.str = str;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.print("| ");
        System.out.print(str);
        System.out.println(" |");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        var len = this.str.length() + 2;
        System.out.print("+");
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
