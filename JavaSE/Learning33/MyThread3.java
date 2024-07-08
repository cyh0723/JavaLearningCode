package JavaSE.Learning33;

import java.util.concurrent.Callable;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/28 18:09
 */
public class MyThread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
