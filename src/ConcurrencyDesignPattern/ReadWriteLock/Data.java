package ConcurrencyDesignPattern.ReadWriteLock;

/**
 * @author ankh
 * @created at 2022-09-14 13:22
 */
public class Data {
    private final char[] buffer;
    private final ReadWriteLock lock = new ReadWriteLock();

    public Data(int size) {
        this.buffer = new char[size];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = '*';
        }
    }

    public char[] read() throws InterruptedException {
        lock.readLock();
        try {
            return doRead();
        } finally {
            lock.readUnlock();
        }
    }

    public void write(char c) throws InterruptedException {
        lock.writeLock();
        try {
            doWrite(c);
        } finally {
            lock.writeUnlock();
        }
    }

    private void doWrite(char c) {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            zzz();
        }
    }

    private char[] doRead() {
        char [] newbuf = new char[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            newbuf[i] = buffer[i];
        }
        zzz();
        return newbuf;
    }

    private void zzz() {
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
