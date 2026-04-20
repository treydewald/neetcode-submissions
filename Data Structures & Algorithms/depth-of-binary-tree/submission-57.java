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
        //8
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        if (root == null){
            return level;
        }
        q.add(root);
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
