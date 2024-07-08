package JavaSE.Learning02;

import java.sql.SQLOutput;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/1 20:21
 */
public class Worker extends Person implements Study,Cloneable{
    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }
    public void working(){
        System.out.println(super.getName());
    }
    @Override
    public void modify(Worker worker){
        System.out.println("hello");
    }

    @Override
    public void study() {
        System.out.println("工人在学东西！！");
    }
}
