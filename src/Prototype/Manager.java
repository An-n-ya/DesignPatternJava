package Prototype;

import java.util.HashMap;

/**
 * @author ankh
 * @created at 2022-09-08 15:56
 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        return showcase.get(protoname).createClone();
    }
}
