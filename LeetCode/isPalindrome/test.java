package LeetCode.isPalindrome;

import java.util.ArrayList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/24 9:38
 */
public class test {
    public static void main(String[] args) {
        ListNode head=new ListNode(1, new ListNode(2,null));
        Solution s=new Solution();
        boolean palindrome = s.isPalindrome(head);
        System.out.println(palindrome);

    }
}
