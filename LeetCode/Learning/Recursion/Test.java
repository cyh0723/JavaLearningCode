package LeetCode.Learning.Recursion;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/25 13:10
 * Recursion 递归
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int recur(int n,int res){
        if (n==0)
            return res;
        return recur(n-1,res+n);
    }

    public static int fib(int n){
        if (n==1)
            return 0;
        if (n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
