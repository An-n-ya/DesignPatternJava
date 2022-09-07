package Adapter.Extends;

import Adapter.Banner;
import Adapter.Print;

/**
 * @author ankh
 * @created at 2022-09-07 15:14
 */
public class PrintBannerExtends extends Banner implements Print {
    public PrintBannerExtends(String string) {
        super(string);
    }

    @Override
    public String printWeak() {
        return this.showWithParen();
    }

    @Override
    public String printStrong() {
        return this.showWithAster();
    }
}
