package concurrent.chapterthree;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.concurrent.TimeUnit;

public class ThisEscape {
    public final int id;
    public final String name;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .toString();
    }

    public ThisEscape(EventSource<AEventListener> eventSource) {
        id = 1;
        eventSource.registerListener(
                new AEventListener() {
                    @Override
                    public void onEvent(Object object) {
                        System.out.println("id:" + id);
                        System.out.println("name:" + name);
                    }

                });
        try {
            TimeUnit.SECONDS.sleep(1);//此处加入相关断点。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        name = "thisEscape test.";
    }

}
