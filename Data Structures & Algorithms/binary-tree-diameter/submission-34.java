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
    private int dia =0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return dia;
    }
    private int findDia(TreeNode root){
        if (root == null) return 0;
        int left = findDia(root.left);
        int right = findDia(root.right);
        dia = Math.max(dia, left+right);
        return 1 + Math.max(left, right);
    }
}
