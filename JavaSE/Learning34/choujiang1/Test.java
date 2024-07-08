package JavaSE.Learning34.choujiang1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 15:04
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);


        MyCall c1=new MyCall("抽奖箱1",list);
        MyCall c2=new MyCall("抽奖箱2",list);
        FutureTask<Integer> f1=new FutureTask<>(c1);
        FutureTask<Integer> f2=new FutureTask<>(c2);
        Thread t1=new Thread(f1);
        Thread t2=new Thread(f2);
        t1.start();
        t2.start();

        int max=f1.get().intValue()>f2.get().intValue() ? f1.get() :f2.get();
        System.out.println(max);
//        MyThread t1=new MyThread("抽奖箱1",list);
//        MyThread t2=new MyThread("抽奖箱2",list);
//        t1.start();
//        t2.start();
    }
}
