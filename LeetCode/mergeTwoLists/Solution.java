package LeetCode.mergeTwoLists;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/26 18:54
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode prehead=new ListNode(-1);
        ListNode pre=prehead; //不创建prehead会怎么样??

        while (list1!=null && list2!=null){
            if (list1.val<=list2.val){
                pre.next=list1;
                list1=list1.next;
            }else {
                pre.next=list2;
                list2=list2.next;
            }
            pre=pre.next;
        }
        pre.next=list1==null ? list2 : list1;

        return prehead.next;
    }
}
