package JavaSE.Learning34;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/30 22:53
 */
public class Hongbao {
    public static double currentSum=100;
    public static int count=3;
    public static final double MIN=0.01;

    public static Lock lock=new ReentrantLock();

}
