package JavaSE.Learning35;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 19:41
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
