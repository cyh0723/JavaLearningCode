package JavaSE.Learning33;

import java.util.concurrent.Callable;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 22:04
 */
public class Eater implements Runnable {
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();//然当前线程和锁绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("在吃"+"还能在吃"+--Desk.count+"碗");
                        Desk.foodFlag=0;
                        Desk.lock.notifyAll();


                    }
                }
            }
        }
    }
}
