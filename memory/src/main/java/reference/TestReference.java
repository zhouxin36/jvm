package reference;


import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * -XX:+UseG1GC
 */
public class TestReference {

    public static void main(String[] args) {
//        softReference();
        weakReference();
//        phantomReference();
    }

    private static void softReference(){
        Object object = new Object();
        ReferenceQueue<Object> softRefQueue = new ReferenceQueue<>();
        SoftReference<Object> softReference = new SoftReference<>(object,softRefQueue);
        System.out.println("gc前->软引用："+softReference.get());
        System.out.println("gc前->软引用："+softRefQueue.poll());
        object = null;
        System.gc();
        System.out.println("gc后->软引用："+softReference.get());
        System.out.println("gc后->软引用："+softRefQueue.poll());
    }

    private static void weakReference(){
        Object object = new Object();
        ReferenceQueue<Object> weakRefQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(object,weakRefQueue);
        System.out.println("gc前->弱引用："+weakReference.get());
        System.out.println("gc前->弱引用："+weakRefQueue.poll());
        object = null;
        System.gc();
        System.out.println("gc后->弱引用："+weakReference.get());
        System.out.println("gc后->弱引用："+weakRefQueue.poll());
    }

    private static void phantomReference(){
        Object object = new Object();
        ReferenceQueue<Object> phantRefQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(object,phantRefQueue);
        System.out.println("gc前->虚引用："+phantomReference.get());
        System.out.println("gc前->虚引用："+phantRefQueue.poll());
        object = null;
        System.gc();
        System.out.println("gc后->虚引用："+phantomReference.get());
        System.out.println("gc后->虚引用："+phantRefQueue.poll());
    }
}
