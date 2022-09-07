package Adapter;

import Adapter.Delegate.PrintBannerDelegateTest;
import Adapter.Extends.PrintBannerExtendsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author ankh
 * @created at 2022-09-07 15:31
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PrintBannerDelegateTest.class, PrintBannerExtendsTest.class})
public class AdaptorTest {
}
