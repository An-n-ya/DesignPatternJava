package Prototype;

/**
 * @author ankh
 * @created at 2022-09-08 16:28
 */
public class Main {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.register("starBox", new MessageBox('*'));
        manager.register("slash", new UnderlinePen('_'));

        String s = manager.create("starBox").use("Hello World!");
        System.out.println(s);
    }
}
