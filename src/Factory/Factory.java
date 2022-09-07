package Factory;

/**
 * @author ankh
 * @created at 2022-09-07 15:59
 */
public abstract class Factory {
    public final Product create(String owner) {
         Product p = createProduct(owner);
         registerProduct(p);
         return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
