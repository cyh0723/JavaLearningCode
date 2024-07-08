package LeetCode;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/20 22:01
 *
 * 零矩阵  编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 *
 *
 */
public class SetZeroes {
    public void setZeros(int[][] matrix){
        int[] row= new int[matrix.length];
        int[] column= new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i]==1||column[j]==1)
                    matrix[i][j]=0;
            }
        }
    }
}
