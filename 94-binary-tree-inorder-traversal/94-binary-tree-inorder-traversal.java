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
    public List<Integer> traverse(TreeNode root, List<Integer> inorder ){
        
        if(root != null){
             traverse(root.left, inorder);
            inorder.add(root.val);
            traverse(root.right, inorder);
           
        }
        return inorder;
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        return traverse(root, inorder);
    }
}