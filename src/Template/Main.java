package Template;

/**
 * @author ankh
 * @created at 2022-09-07 15:53
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay display = new StringDisplay("Hello, World!");
        String res = display.display();
        System.out.println(res);

        display = new CharDisplay('A');
        res = display.display();
        System.out.println(res);
    }
}
