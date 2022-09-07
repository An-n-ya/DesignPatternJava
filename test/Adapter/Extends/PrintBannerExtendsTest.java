package Adapter.Extends;

import Adapter.Print;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ankh
 * @created at 2022-09-07 15:29
 */
public class PrintBannerExtendsTest {
    Print print;
    @Before
    public void setUp() {
        print = new PrintBannerExtends("Hello World");
    }

    @Test
    public void printWeak() {
        assertEquals("(Hello World)", print.printWeak());
    }

    @Test
    public void printStrong() {
        assertEquals("*Hello World*", print.printStrong());
    }
}