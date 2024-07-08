package JavaSE.Learning33;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/28 17:54
 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread=Thread.currentThread();

            System.out.println(thread.getName()+i);
        }
    }
}
