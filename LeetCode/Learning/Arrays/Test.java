package LeetCode.Learning.Arrays;

import java.util.Arrays;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/25 13:34
 */
public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        delete(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arrs,int num,int index){
        for (int i = arrs.length - 1; i > index; i--) {
            arrs[i]=arrs[i-1];
        }
        arrs[index]=num;
    }

    public static void delete(int[] arrs,int index){
        for (int i = index; i < arrs.length-1; i++) {
            arrs[i]=arrs[i+1];
        }
    }
}
