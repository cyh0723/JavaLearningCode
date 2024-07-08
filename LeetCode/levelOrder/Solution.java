package LeetCode.levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/2 22:10
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null)
            return list;

        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> integerList=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                integerList.add(node.val);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
            list.add(integerList);
        }
        return list;
    }
}
