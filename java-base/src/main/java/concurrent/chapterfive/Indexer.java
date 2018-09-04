package concurrent.chapterfive;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class Indexer implements Runnable {

    private final BlockingQueue<File> fileQueue;

    public Indexer(BlockingQueue<File> fileQueue) {
        this.fileQueue = fileQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                indexFile(fileQueue.take());
            }
        }catch (InterruptedException e){
            //恢复被中断的状态
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    private void indexFile(File file){
        System.out.println(file.getPath()+"\\"+file.getName());
    }
}
