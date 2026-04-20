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
        //6
        if (subRoot == null) return true;
        if (root == null) return false;
        boolean fromRoot = isSameTree(root, subRoot);
        boolean fromLeft = isSubtree(root.left, subRoot);
        boolean fromRight = isSubtree(root.right, subRoot);
        return fromRoot || fromLeft || fromRight;
    }
    private boolean isSameTree(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;
        else if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
}
