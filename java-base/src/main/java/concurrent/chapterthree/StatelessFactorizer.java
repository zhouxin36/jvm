package concurrent.chapterthree;

public class StatelessFactorizer  {
    public static void main(String[] args) {
        EventSource<AEventListener> eventSource = new EventSource<>();
        ListenerRunnable listenerRunnable = new ListenerRunnable(eventSource);
        new Thread(listenerRunnable).start();
        System.out.println();
        ThisEscape escape = new ThisEscape(eventSource);
        System.out.println(escape);
    }
}
