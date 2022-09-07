package Factory.CardFactory;

import Factory.Factory;
import Factory.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ankh
 * @created at 2022-09-07 16:16
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        var owner = ((IDCard) product).getOwner();
        System.out.println("正在注册" + owner + "的卡片");
        owners.add(owner);
    }

}
