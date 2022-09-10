package Bridge;

/**
 * @author ankh
 * @created at 2022-09-10 15:05
 *
 * 在功能层次上增加新的类（添加新功能：多行显示）
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int count) {
        open();
        for (int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}
