package Prototype;

/**
 * @author ankh
 * @created at 2022-09-08 15:55
 */
public interface Product extends Cloneable {
    String use(String s);
    Product createClone();
}
