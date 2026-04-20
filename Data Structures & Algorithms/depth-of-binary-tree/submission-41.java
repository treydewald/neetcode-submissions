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
    public int maxDepth(TreeNode root) {
        //7
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null){
            q.add(root);
        }
        int level = 0;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i =0; i < size; i++){
                root = q.poll();
                if (root.left != null){
                    q.add(root.left);
                }
                if (root.right != null){
                    q.add(root.right);
                }
            }
            level++;
        }
        return level;
    }
}
