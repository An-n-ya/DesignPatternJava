package Bridge;

/**
 * @author ankh
 * @created at 2022-09-10 15:02
 *
 * 功能层次的顶级结构，通过委托实现层次的类实现基本功能
 */
public class Display {
    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    protected void open() {displayImpl.rawOpen();}
    protected void print() {displayImpl.rawPrint();}
    protected void close() {displayImpl.rawClose();}

    public void display(){
        open();
        print();
        close();
    }
}
