package LeetCode.maxArea;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/29 21:29
 * LeetCode 11 盛最多水的容器
 *
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 */
public class Solution {
    public int maxArea(int[] height){
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        while (i<j){
            maxArea = height[i] < height[j] ? Math.max(maxArea, (j - i) * height[i++]) : Math.max(maxArea, (j - i) * height[j--]);
        }
        return maxArea;
    }
}
