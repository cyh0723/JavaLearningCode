package JavaSE.Learning13;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/18 14:20
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner i=new Outer().new Inner();
        i.show();
    }
}
