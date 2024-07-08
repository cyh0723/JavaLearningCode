package LeetCode.levelOrder;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/2 22:09
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
