package LeetCode;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/20 20:52
 * LeetCode48   旋转矩阵https://leetcode-cn.com/problems/rotate-image/
 *
 *  不占用额外的空间是如何进行两数交换的
 */
public class RotateImage {
    public void rotate(int[][] matrix){
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=matrix[i][j]+matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j]=matrix[i][j]-matrix[matrix.length-1-i][j];
                matrix[i][j]=matrix[i][j]-matrix[matrix.length-1-i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j]=matrix[i][j]+matrix[j][i];
                matrix[j][i]=matrix[i][j]-matrix[j][i];
                matrix[i][j]=matrix[i][j]-matrix[j][i];
            }
        }

    }
}
