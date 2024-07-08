package JavaSE.Learning34;

import java.util.Random;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/30 22:54
 */
public class Qiang extends Thread{
    private double money;
    private int flag=0;

    Qiang(String name){
        this.setName(name);
    }

    @Override
    public void run() {

        Hongbao.lock.lock();
        if (Hongbao.count!=0){
            if (Hongbao.count==1){
                this.money=Hongbao.currentSum;
                Hongbao.count--;
            }else {
                double bounds=Hongbao.currentSum-(Hongbao.count-1)*Hongbao.MIN;

                Random rand=new Random();
                this.money = rand.nextDouble(bounds);
                if (this.money<Hongbao.MIN)
                    this.money=Hongbao.MIN;
                Hongbao.currentSum=Hongbao.currentSum-this.money;
                Hongbao.count--;

            }
            System.out.println(Thread.currentThread().getName()+"抢到了"+this.money+"元");


        }else {

            System.out.println(Thread.currentThread().getName()+"没抢到");

        }
        Hongbao.lock.unlock();

    }
}
