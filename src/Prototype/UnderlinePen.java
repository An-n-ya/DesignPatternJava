package Prototype;

/**
 * @author ankh
 * @created at 2022-09-08 16:24
 */
public class UnderlinePen implements Product{
    private char underlineChar;
    public UnderlinePen(char c){
        this.underlineChar = c;
    }
    @Override
    public String use(String s) {
        int len = s.length();
        var ret = new StringBuilder();
        ret.append('"');
        ret.append(s);
        ret.append('"');
        ret.append('\n');
        for (int i = 0; i < len; i++) {
            ret.append(underlineChar);
        }
        ret.append('\n');
        return ret.toString();
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
