package Prototype;

/**
 * @author ankh
 * @created at 2022-09-08 16:17
 */
public class MessageBox implements Product{
    private char decorateChar;
    public MessageBox(char c) {
        this.decorateChar = c;
    }
    @Override
    public String use(String s) {
        StringBuilder ret = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len + 4; i++) {
            ret.append(decorateChar);
        }
        newLine(ret);
        ret.append(decorateChar + " " + s + " " + decorateChar);
        newLine(ret);
        for (int i = 0; i < len + 4; i++) {
            ret.append(decorateChar);
        }
        return ret.toString();
    }

    private void newLine(StringBuilder sb) {
        sb.append('\n');
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
