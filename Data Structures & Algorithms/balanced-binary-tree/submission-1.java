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
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1; 
    }

    int dfs(TreeNode root) {
        if(root == null) return 0;

        int lHeight = dfs(root.left);
        int rHeight = dfs(root.right);
        
        if(lHeight == -1 || rHeight == -1) return -1;

        if(Math.abs(lHeight - rHeight) > 1) return -1;

        return 1 + Math.max(lHeight, rHeight);
    }
}
