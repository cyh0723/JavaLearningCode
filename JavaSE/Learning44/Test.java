package JavaSE.Learning44;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 14:18
 */
public class Test {
    public static void main(String[] args) {
        BigStar bigStar=new BigStar("xiaoji");
        Star starProxy=ProxyUtil.createProxy(bigStar);
        String str=starProxy.sing("haorizi");
        System.out.println(str);

    }
}
