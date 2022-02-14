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
    public int sum =0;
    
    public void Sum (TreeNode root, int low, int high){
   
        if(root!= null){
           if( root.val >= low && root.val <= high){
           sum += root.val;
        }
        if(root.val > low){
            Sum(root.left, low, high);
        }
        if(root.val < high){
            Sum(root.right, low, high);
        } 
        }
        
        
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum(root, low, high);
        return sum;
    }
}