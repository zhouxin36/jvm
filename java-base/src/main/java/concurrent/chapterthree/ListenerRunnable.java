package concurrent.chapterthree;

import java.util.List;

public class ListenerRunnable implements Runnable {

    private EventSource<AEventListener> source;
    ListenerRunnable(EventSource<AEventListener> source) {
        this.source = source;
    }

    @Override
    public void run() {
        List<AEventListener> listeners = null;
        try {
            listeners = source.retrieveListeners();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (AEventListener eventListener : listeners) {
            eventListener.onEvent(new Object());
        }
    }
}
