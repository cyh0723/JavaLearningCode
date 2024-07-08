package LeetCode.subarraySum;

import java.util.HashMap;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/28 21:46
 *
 * LeetCode  560  和位K的子数组
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 *
 * 子数组是数组中元素的连续非空序列。
 */
public class Solution {
    public int subarraySum(int[] nums, int k){
//        int counts=0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum=0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//                if (sum==k)
//                    counts++;
//            }
//        }
//        return counts;
        
        int counts=0;
        int presum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            presum+=nums[i];
            if (h.containsKey(presum-k)){
                counts+=h.get(presum-k);
            }
            h.put(presum,h.getOrDefault(presum,0)+1);

        }
        return counts;
    }
}
