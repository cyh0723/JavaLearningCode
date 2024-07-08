package JavaSE.Learning33;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/28 17:49
 */
public class MyThread extends Thread{
    static Lock lock=new ReentrantLock();
    public MyThread(String name) {
        super(name);
    }

    static int ticket=0;
    @Override
    public void run() {
        while (true){
            lock.lock();
            if (method()) break;

        }
    }

    private static boolean method() {
        try {
            if (MyThread.ticket<100){

                MyThread.ticket++;
                System.out.println(Thread.currentThread().getName()+"正在卖第"+MyThread.ticket+"张票！");
            }else {
                System.out.println(Thread.currentThread().getName()+"票无");
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        return false;
    }
}
