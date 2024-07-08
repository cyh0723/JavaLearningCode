package JavaSE.Learning14;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/18 17:04
 */
public class Test {
    public static void main(String[] args) {


        test(new Swim(){

            @Override
            public void swim() {
                System.out.println("在游泳");
            }
        });
    }
    public static void test(Swim s){
        s.swim();
    }
}
