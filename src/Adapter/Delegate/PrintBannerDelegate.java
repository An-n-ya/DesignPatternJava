package Adapter.Delegate;

import Adapter.Banner;
import Adapter.Print;

/**
 * @author ankh
 * @created at 2022-09-07 15:16
 */
public class PrintBannerDelegate implements Print {
    private Banner banner;
    public PrintBannerDelegate(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public String printWeak() {
        return banner.showWithParen();
    }

    @Override
    public String printStrong() {
        return banner.showWithAster();
    }
}
