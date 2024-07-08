package JavaSE.Learning34;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/30 22:38
 */
public class MaiPiao extends Thread{
    private static  int ticketNum=0;
    public static Lock lock=new ReentrantLock();

    MaiPiao(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (MaiPiao.ticketNum<1000){
                MaiPiao.ticketNum++;
                System.out.println(Thread.currentThread().getName()+"卖出一张票，还有"+String.valueOf(1000-MaiPiao.ticketNum)+"张票");
            }else {
                System.out.println("票无了");
                break;
            }
            lock.unlock();
        }
    }
}
