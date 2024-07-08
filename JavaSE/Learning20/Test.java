package JavaSE.Learning20;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/17 15:07
 */
public class Test {
    public static void main(String[] args) {
        int a =10;
        Integer i1=10; //自动装箱
        Integer I2=20;

        int result=i1+I2; //自动拆箱
        System.out.println(Integer.toBinaryString(result));
        System.out.println(Integer.parseInt("11 11"));
    }
}
