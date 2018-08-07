package error.oom;

/**
 * 堆内存中的空间不足以存放新创建的对象
 * java.lang.OutOfMemoryError: Java heap space
 *
 * VM Args: -Xmx12m -XX:+PrintGCDetails
 * VM Args: -Xmx13m -XX:+PrintGCDetails
 */
public class HeapOOM {

    static final int SIZE=2*1024*1024;
    public static void main(String[] a) {
        int[] i = new int[SIZE];
    }
}
