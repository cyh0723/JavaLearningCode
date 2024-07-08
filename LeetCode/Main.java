package LeetCode;

import java.util.Arrays;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2023/12/4 15:45
 */
public class Main {
    public static void main(String[] args) {
        int[][] array={{2,3}};
        FindDiagonalOrder findDiagonalOrder=new FindDiagonalOrder();
        int[] diagonalOrder = findDiagonalOrder.findDiagonalOrder(array);
        System.out.println(Arrays.toString(diagonalOrder));

    }
}
