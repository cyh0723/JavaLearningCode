package LeetCode.reverseList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/23 16:06
 * LeetCode 206 反转链表
 */
public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode newHead=null;
        ListNode cur=head;

        while (cur!=null){
            ListNode next = cur.next;
            cur.next=newHead;
            newHead=cur;
            cur=next;
        }
        return newHead;

    }
}
