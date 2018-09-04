package concurrent.chapterfive;

import base.User;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Preloader {
    //提前执行高开销的计算
    private final FutureTask<User> futureTask = new FutureTask<>(User::new);

    private final Thread thread = new Thread(futureTask);

    public void start(){
        thread.start();
    }

    public User get() throws Exception{
        try {
            return futureTask.get();
        }catch (ExecutionException e){
            e.printStackTrace();
            throw new InterruptedException();
        }
    }
}
