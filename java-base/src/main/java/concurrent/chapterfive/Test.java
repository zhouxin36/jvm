package concurrent.chapterfive;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws Exception{
//        startIndexing();
//        timeTasks();
//        semaphore();
//        cyclic();
//        test();
    }

    private static final int QUEUE_SIZE = 5;
    private static final int CONDUMERS = 2;

    /**
     * 生产者与消费者
     */
    private static void startIndexing() {
        File[] roots = {new File("E:/CloudMusic")};
        BlockingQueue<File> queue = new LinkedBlockingQueue<>(QUEUE_SIZE);
        FileFilter fileFilter = (File e) -> e.getName().contains("");
        for (File root : roots) {
            new Thread(new FileCrawler(queue, fileFilter, root)).start();
        }
        for (int i = 0; i < CONDUMERS; i++) {
            new Thread(new Indexer(queue)).start();
        }
    }

    private static final int THREADS = 10;

    /**
     * 闭锁
     *
     * @throws InterruptedException
     */
    private static void timeTasks() throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(THREADS);

        for(int i = 0;i < THREADS; i++){
            Thread thread = new Thread(()-> {
                try {
                    //count不等于0阻塞等待
                    startGate.await();
                    System.out.println("startGate.await:"+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }finally {
                    endGate.countDown();
                    System.out.println("endGate.countDown:"+Thread.currentThread().getName());
                }
            });
            thread.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        System.out.println("startGate.countDown");
        endGate.await();
        System.out.println("endGate.await");
        long end = System.nanoTime();
        System.out.println("时间差"+(end-start));

    }

    private static void semaphore() throws Exception{
        //信号量
        final Semaphore semaphore = new Semaphore(4);
        //-1
        semaphore.acquire();
        //+1
        semaphore.release();
    }

    private static void cyclic() {
        //栅栏 当cyclicBarrier.await();执行4次时调用()-> System.out.println("hehe")
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4,()-> System.out.println("hehe"));
        System.out.println("hehe0");
        for (int i = 0; i < 4; i++) {
            int j = i;
            new Thread(()->{
                try {
                    System.out.println("hehe"+(j+1));
                    cyclicBarrier.await();
                    System.out.println("呵呵哒的 啊");
                }catch (Exception e){
                    e.printStackTrace();
                }
        }).start();
        }
    }

    public static void test(){
        ConcurrentHashMap<String, Integer> stringIntegerConcurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 10; i++) {
            stringIntegerConcurrentHashMap.put("key",i);
        }
    }
}
