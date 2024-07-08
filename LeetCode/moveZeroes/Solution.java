package LeetCode.moveZeroes;

import java.util.Arrays;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/28 15:59
 * LeetCode  283
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class Solution {
    public void moveZeros(int[] nums){
        int zeroCounts=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==0){
                zeroCounts++;
            }else {
                int temp=nums[i];
                nums[i-zeroCounts]=temp;
            }

        }
        for (int i =nums.length-zeroCounts ; i < nums.length; i++) {
            nums[i]=0;
        }

    }
}
