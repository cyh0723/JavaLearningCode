package JavaSE.Learning01;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/1 9:57
 */
public class firstClass {
    public int F(int x){
        if (x==0)
            return 0;
        else if (x==1)
            return 1;
        else
            return F(x-1)+F(x-2);

    }
    public static void main(String[] args) {
        firstClass test=new firstClass();
        int target=7;
        int result=test.F(target);
        System.out.println(result);
    }
}
