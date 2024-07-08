package LeetCode;

import Algorithm.Array.Main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/20 22:33
 * 对角线遍历  给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 * (1)首先得出遍历的次数为  n+n-1
 * (2)对角线上 每个元素坐标之和为i+j=n
 * (3)如何遍历？  偶数对角线从下往上遍历，奇数对角线从上往下遍历。所以只要确定每次遍历的起点和终点
 * 当i＜n-1时，起始点坐标x=i，结束点坐标x=0
 * 当i≥n-1时，起始点坐标x=n-1，结束点坐标y=n-1
 * 所以偶数对角线遍历的起点x坐标为min(i,n-1),终点x坐标max(0,i-(m-1))),而纵坐标为i-x
 */
public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix){
        int m= matrix.length;//矩阵长的长度
        int[] result=new int[m*m];
        for (int i = 0,idx=0; i < m+m-1; i++) {
            if(i%2==0)  {//偶数对角线 从下网上遍历
                for (int j = Math.min(i,m-1); j >=Math.max(0,i-m+1) ; j--) {
                    result[idx++]=matrix[j][i-j];
                }
            }else {
                for (int j = Math.max(0,i-m+1); j <=Math.min(i,m-1) ; j++) {
                    result[idx++]=matrix[j][i-j];
                }
            }
        }
        return result;
    }
}
