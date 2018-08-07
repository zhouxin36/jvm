package error.oom;

import java.util.Map;
import java.util.Random;

/**
 *错误只在连续多次 GC 都只回收了不到2%的极端情况下才会抛出
 * java.lang.OutOfMemoryError: GC overhead limit exceeded
 *
 * -Xmx12m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
 */
public class OverHeadOOM {
    public static void main(String args[]) throws Exception {
        Map map = System.getProperties();
        Random r = new Random();
        while (true) {
            map.put(r.nextInt(), "value");
        }
    }
}
