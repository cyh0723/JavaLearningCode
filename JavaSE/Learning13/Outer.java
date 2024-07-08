package JavaSE.Learning13;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/18 16:05
 */
public class Outer {
    private int a=10;

    class Inner{
        private int a=20;

        public void show(){
            int a=30;
            System.out.println(a);//30
            System.out.println(this.a);//20
            System.out.println(Outer.this.a);//10
        }
    }
}
