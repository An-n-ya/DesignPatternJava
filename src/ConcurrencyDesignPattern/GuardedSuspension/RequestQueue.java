package ConcurrencyDesignPattern.GuardedSuspension;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ankh
 * @created at 2022-09-12 16:27
 */
public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    public synchronized Request getRequest() throws InterruptedException {
        while (queue.peek() == null) {
            // 如果队列为空就一直等着
            wait();
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
