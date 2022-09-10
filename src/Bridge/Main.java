package Bridge;

/**
 * @author ankh
 * @created at 2022-09-10 15:11
 */
public class Main {
    public static void main(String[] args) {
        DisplayImpl impl = new StringDisplayImpl("Hello World!");
        Display display = new Display(impl);

        CountDisplay dis2 = new CountDisplay(impl);

        display.display();

        dis2.display();
        dis2.multiDisplay(3);
    }
}
