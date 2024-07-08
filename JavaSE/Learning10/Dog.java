package JavaSE.Learning10;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/13 20:47
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String thing){
        System.out.println("狗在吃"+thing);
    }
}
