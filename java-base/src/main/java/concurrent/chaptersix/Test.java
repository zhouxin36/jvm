package concurrent.chaptersix;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws Exception{
//        executor();
//        executorService();
//        executorFuture();
        executorCompletion();
    }

    /**
     * 线程池
     * 缺点，无法正常停止
     */
    private static void executor(){
        //建立最大为10的线程池
        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(()->
            System.out.println("hehe")
        );
        ((ExecutorService) executor).shutdown();
    }

    /**
     * 线程池
     * 缺点，无返回值
     */
    private static void executorService(){
        //建立最大为10的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(()->
                System.out.println("hehe")
        );
        executorService.shutdown();
    }

    /**
     * 线程池
     * 缺点：整进整出
     */
    private static void executorFuture() throws Exception{
        //建立最大为10的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> hehe = executorService.submit(() -> {
            System.out.println("hehe");
            return "呵呵";
        });
        System.out.println(hehe.get());
        executorService.shutdown();
    }
    /**
     * 线程池
     * 每当一个任务完成，就可以得到结果
     * @throws Exception
     */
    private static void executorCompletion() throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorCompletionService<String> stringExecutorCompletionService = new ExecutorCompletionService<>(executorService);
        for (int i = 0; i < 10; i++) {
            int j = i;
            stringExecutorCompletionService.submit(()-> {
                String str = "呵呵" + j;
                Thread.sleep(100*(10-j));
                System.out.println(str);
                return str;
            });
        }
        for (int i = 0; i < 10; i++) {
            Future<String> take = stringExecutorCompletionService.take();
            String s = take.get();
            System.out.println("after:"+s);
        }
        executorService.shutdown();
    }
}
