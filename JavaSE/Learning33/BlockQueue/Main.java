package JavaSE.Learning33.BlockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 23:03
 */
public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(10);
        Cook cook=new Cook(queue);
        Eater eater=new Eater(queue);
        cook.start();
        eater.start();

    }
}
