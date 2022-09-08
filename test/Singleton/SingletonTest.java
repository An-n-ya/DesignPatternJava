package Singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ankh
 * @created at 2022-09-08 15:51
 */
public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        assertEquals(true, instance1 == instance2);
        assertEquals(true, instance1 == instance3);
        assertEquals(true, instance3 == instance2);
    }
}