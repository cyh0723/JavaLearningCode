package JavaSE.Learning33;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/29 22:05
 */
public class Desk {
    public  static int foodFlag=0;

    public static int count=10;

    public static Lock lock=new ReentrantLock();


}
