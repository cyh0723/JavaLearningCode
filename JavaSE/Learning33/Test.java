package JavaSE.Learning33;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/28 17:06
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread myThread=new MyThread("1@");
//
////        myThread.setPriority(10);
////        MyThread myThread2=new MyThread("2@");
////        myThread2.setDaemon(true);  //其他非守护进程执行完毕后  守护进程会在一段时间内结束
////        myThread2.setPriority(1);
//        myThread.start();
        //把myThread线程插入到main线程前

//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+i);
//
//        }

//        myThread2.start();
//        System.out.println(myThread.getName());
//        System.out.println(123);
//        Thread.sleep(5000);
//        System.out.println(321);

//        MyThread2 myThread2=new MyThread2();
//        Thread t=new Thread(myThread2);
//        t.setName("xianchen");
//        t.start();

//        MyThread3 myThread3=new MyThread3();
//        FutureTask<Integer> futureTask=new FutureTask<>(myThread3);
//        Thread thread=new Thread(futureTask);
//        thread.start();
//        Integer i = futureTask.get();
//        System.out.println(i);


//        MyThread thread1=new MyThread("窗口1");
//        MyThread thread2=new MyThread("窗口2");
//        MyThread thread3=new MyThread("窗口3");
//        thread1.start();
//        thread2.start();
//        thread3.start();


        Eater eater=new Eater();
        Cook cook=new Cook();
        Thread thread1=new Thread(eater);
        FutureTask<Integer> futureTask=new FutureTask<>(cook);
        Thread thread2=new Thread(futureTask);
        thread1.start();
        thread2.start();
    }
}
