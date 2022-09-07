package Factory;

import Factory.CardFactory.IDCardFactory;

/**
 * @author ankh
 * @created at 2022-09-07 16:19
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小张");
        card1.use();
    }
}
