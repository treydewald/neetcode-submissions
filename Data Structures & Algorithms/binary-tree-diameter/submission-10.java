/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    //8
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return max;
    }
    private int findDia(TreeNode root){
        if (root == null) return 0;
        int left = findDia(root.left);
        int right = findDia(root.right);
        int cur = left + right;
        max = Math.max(max, cur);
        return 1 + Math.max(left, right);
    }
}
