package concurrent.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class Test {

    private final static int MAX_THRESHOLD = 30;

    private static class CalcluatedRecursiveTask extends RecursiveTask<Integer>{

        private final int start;
        private final int end;

        public CalcluatedRecursiveTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if(end - start <= MAX_THRESHOLD){
                return IntStream.rangeClosed(start,end).sum();
            }else {
                int middle = (start + end)/2;
                CalcluatedRecursiveTask leftTask = new CalcluatedRecursiveTask(start,middle);
                CalcluatedRecursiveTask rightTask = new CalcluatedRecursiveTask(middle + 1,end);

                leftTask.fork();
                rightTask.fork();

                return leftTask.join() + rightTask.join();
            }
        }
    }

    public static void main(String[] args) {
        final ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> future = forkJoinPool.submit(new CalcluatedRecursiveTask(0, 1000));
        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
