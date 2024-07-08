package Algorithm.Array;

import java.util.Random;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/20 20:46
 */
public class Main {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        Random random=new Random();
        int ranNum = random.nextInt(0, array.length);
        System.out.println(ranNum);
        System.out.println(array[ranNum]);

    }
}
