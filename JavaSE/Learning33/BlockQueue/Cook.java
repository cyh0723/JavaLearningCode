package JavaSE.Learning33.BlockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 22:39
 */
public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                this.queue.put("面条");
                System.out.println("下面");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
