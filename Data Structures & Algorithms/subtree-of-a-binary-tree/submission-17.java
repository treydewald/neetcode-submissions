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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean fromRoot = isSameTree(root, subRoot);
        boolean leftRoot = false;
        boolean rightRoot = false;
        if (root.left != null) {
            leftRoot = isSubtree(root.left, subRoot);
        }
        if (root.right != null) {
            rightRoot = isSubtree(root.right, subRoot);
        }
        return fromRoot || leftRoot || rightRoot;
    }
    private boolean isSameTree(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;
        else if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
}
