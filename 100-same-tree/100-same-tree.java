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
    public boolean checkIfSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
          if(p == null ||q == null ){
            return false;
        }
        
        if(p.val != q.val){
            System.out.println("base case " + p.val);
            return false;
        }
     
        boolean isLeftSame = checkIfSame(p.left, q.left);
        boolean isRightSame = checkIfSame(p.right, q.right);
        return (isLeftSame && isRightSame);
    }
  
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return checkIfSame(p,q);
    }
}