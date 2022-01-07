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
    
    public List<Integer> inorder (TreeNode root,  List<Integer> nums){
    
        if(root !=  null){
            inorder(root.left, nums);
            nums.add(root.val);
            inorder(root.right, nums);
        }
        return nums;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        values = inorder(root, values);
        return values.get(k-1);
    }
}