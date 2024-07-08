package JavaSE.Learning11;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/14 14:10
 */
public class Student extends Person implements Swim{
    @Override
    public void work() {
        System.out.println("学生在学习");
    }

    @Override
    public void swim() {
        System.out.println("学生在游泳");
    }
}
