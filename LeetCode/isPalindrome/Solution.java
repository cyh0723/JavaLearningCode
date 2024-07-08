package LeetCode.isPalindrome;

import java.util.ArrayList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/24 9:13
 */
public class Solution {
    public boolean isPalindrome(ListNode head){
        boolean flag=true;
        if (head==null)
            flag=false;
        ListNode cur=head;
        ArrayList<Object> list=new ArrayList<>();
        while (cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i)!=list.get(list.size()-i-1)){
                flag=false;
                return flag;
            }
        }
        return flag;
    }
}
