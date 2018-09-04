package concurrent.chapterthree;

import java.util.ArrayList;
import java.util.List;

public class EventSource<T> {
    private final List<T> eventListeners;
    public EventSource() {
        eventListeners = new ArrayList<>();
    }
    public synchronized void registerListener(T eventListener) {
        this.eventListeners.add(eventListener);
        this.notifyAll();
    }
    public synchronized List<T> retrieveListeners() throws InterruptedException {
        List<T> dest;
        if (eventListeners.size() <= 0) {
            this.wait(); //没有监听器注册到这里，就阻塞该线程。
        }
        dest = new ArrayList<>(eventListeners.size());
        dest.addAll(eventListeners);
        return dest;
    }
}
