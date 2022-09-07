package Adapter;

/**
 * @author ankh
 * @created at 2022-09-07 15:12
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public String showWithAster() {
        var res = "*" + this.string + "*";
        return res;

    }
    public String showWithParen() {
        var res = "(" + this.string + ")";
        return res;
    }
}
