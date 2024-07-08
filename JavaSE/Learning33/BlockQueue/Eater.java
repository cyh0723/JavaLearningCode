package JavaSE.Learning33.BlockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 22:39
 */
public class Eater extends Thread{
    ArrayBlockingQueue<String> queue;

    public Eater(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String food=this.queue.take();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
