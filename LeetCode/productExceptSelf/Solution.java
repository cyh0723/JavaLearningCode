package LeetCode.productExceptSelf;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/25 22:18
 */
public class Solution {
    public int[] productExceptSelf(int[] nums){
//        int[] R=new int[nums.length];
        int[] L=new int[nums.length];
        int[] answer=new int[nums.length];
        L[0]=1;
//        R[R.length-1]=1;
        int R=1;
        L[L.length-1]=1;
        for (int i = 1; i < nums.length; i++) {
            L[i]=L[i-1]*nums[i-1];
        }
//        for (int i = nums.length - 2; i >= 0; i--) {
//            R[i]=R[i+1]*nums[i+1];
//        }
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i]=L[i]*R;
            R=R*nums[i];
        }
        return answer;
    }
}
