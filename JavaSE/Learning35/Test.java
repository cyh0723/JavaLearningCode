package JavaSE.Learning35;

import java.util.concurrent.*;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 19:35
 */
public class Test {
    public static void main(String[] args) {
        //线程池   以前用到多线程的时候是用的时候就创建  现在需要用到线程池

        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,6,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    }
}
