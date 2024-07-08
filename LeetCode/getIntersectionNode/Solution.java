package LeetCode.getIntersectionNode;

import java.util.List;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/23 13:35
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA==null||headB==null)
            return null;
        ListNode pa=headA;
        ListNode pb=headB;

        while (pa!=pb){
            pa = pa==null ? headB :pa.next;
            pb = pb==null ? headA :pb.next;
        }
        return pa;
    }
}
