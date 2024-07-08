package JavaSE.Learning33;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 22:03
 */
public class Cook implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (Desk.foodFlag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("在做");
                        Desk.foodFlag=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
        return 1;
    }
}
