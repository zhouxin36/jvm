package concurrent.chaptertwelve;

public class Test {
    public static void main(String[] args) throws InterruptedException{
//        testIsEmptyWhenConstructed();
//        testIsFullAfterPuts();
        testTakeBlocksWhenEmpty();
    }

    /** -------------------------------------------BoundedBuffer基本单元测试------------------------------------------------ **/
    static void testIsEmptyWhenConstructed(){
        BoundedBuffer<Integer> bb = new BoundedBuffer<>(10);
        assert bb.isEmpty();
        assert !bb.isFull();
    }

    static void testIsFullAfterPuts() throws InterruptedException{
        BoundedBuffer<Integer> bb = new BoundedBuffer<>(10);
        for (int i = 0; i < 10; i++) {
            bb.put(i);
        }
        assert bb.isFull();
        assert !bb.isEmpty();
    }

    /** -------------------------------------------测试阻塞行为及中断的响应性------------------------------------------------ **/

    static void testTakeBlocksWhenEmpty(){
        final BoundedBuffer<Integer> bb = new BoundedBuffer<>(10);
        Thread taker = new Thread(()->{
            try {
                System.out.println("开始验证");
                int unused = bb.take();
                System.out.println("验证失败");
            }catch (InterruptedException e){
                System.out.println("抛出InterruptedException:"+e.getMessage());
            }
        });
        try {
            taker.start();
//            Thread.sleep(10000);
            taker.interrupt();
            taker.join(20000);
            assert !taker.isAlive();
        }catch (Exception e){
            System.out.println("抛出Exception:"+e.getMessage());
        }
    }
}
