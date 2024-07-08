package LeetCode.LearningTree;

import LeetCode.hasCycle.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/2 21:03
 */
public class Test {
    public static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
//层序遍历  利用队列
        TreeNode tree=new TreeNode(1,new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(7,null,null)));
//        List<Integer> list=new ArrayList<>();
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.add(tree);
//        while (!queue.isEmpty()){
//            TreeNode node=queue.poll();
//            list.add(node.val);
//            if (node.left!=null)
//                queue.offer(node.left);
//            if (node.right!=null)
//                queue.offer(node.right);
//        }
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }

//        前序遍历


    }

    public static List<Integer> inorderTraversal(TreeNode root){
        if (root==null)
            return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
