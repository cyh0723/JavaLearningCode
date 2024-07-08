package JavaSE.Learning05;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/6 21:54
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=num++;
                System.out.println(arr[i][j]);
            }
        }
    }
}
