package Factory.CardFactory;

import Factory.Product;

/**
 * @author ankh
 * @created at 2022-09-07 16:14
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("正在制作" + owner + "的卡片。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("正在使用" + owner + "的卡片。");
    }

    public String getOwner() {
        return owner;
    }
}
