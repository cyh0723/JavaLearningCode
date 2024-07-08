package JavaSE.Learning34.choujiang1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 15:04
 */
public class MyThread extends Thread{

    private ArrayList<Integer> list;
    //如果有多个线程怎么办？？？？   --------线程栈  每个线程都有自己的栈
//    private static ArrayList<Integer> list1=new ArrayList<>();
//    private static ArrayList<Integer> list2=new ArrayList<>();

    private static Lock lock=new ReentrantLock();
    public MyThread(String name,ArrayList<Integer> list) {
        this.setName(name);
        this.list=list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList=new ArrayList<>();
        while (true){
            lock.lock();
            try {
                if (list.isEmpty()){
                    boxList.sort((Integer o1, Integer o2) ->
                            o2-o1
                    );

                    int max=boxList.get(0);
                    System.out.println("在此次抽奖过程中，"+Thread.currentThread().getName()+"共产生了"+boxList.size()+"个奖项,"+"分别为："+boxList.toString());
    //                System.out.println("在此次抽奖过程中，"+Thread.currentThread().getName()+"共产生了"+this.rewardlist.size()+"个奖项,"+"分别为："+this.rewardlist.toString());
//                    if ("抽奖箱1".equals(Thread.currentThread().getName())){
//                        System.out.println("在此次抽奖过程中，"+Thread.currentThread().getName()+"共产生了"+MyThread.list1.size()+"个奖项,"+"分别为："+MyThread.list1.toString());
//
//                    }else {
//                        System.out.println("在此次抽奖过程中，"+Thread.currentThread().getName()+"共产生了"+MyThread.list2.size()+"个奖项,"+"分别为："+MyThread.list2.toString());
//
//                    }

                    break;
                }else {
                    Collections.shuffle(list);
                    int reward = list.remove(0);
    //                System.out.println(Thread.currentThread().getName()+"获得了一个"+reward+"元大奖");

                    boxList.add(reward);


                }
            } finally {
                lock.unlock();
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
