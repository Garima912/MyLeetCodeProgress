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
class BSTIterator {
    
    public ArrayList<TreeNode> inorder;
    public int index;

    public BSTIterator(TreeNode root) {
        
        this.inorder = new ArrayList<>();
        performInorder(root);
        index = -1;
    }
    
    private void performInorder(TreeNode root){
        if(root == null){
            return;
        }
        performInorder(root.left);
        this.inorder.add(root);
        performInorder(root.right);
    }
    
    public boolean hasNext() {
        if(index < this.inorder.size()- 1){
            return true;
        }
        return false;
    }
    
    public int next() {
        
            this.index += 1;
            return this.inorder.get(index).val;
        
        
    }
    
    public boolean hasPrev() {
        if(index > 0){
            return true;
        }
        return false;
    }
    
    public int prev() {
        
           this.index = this.index-1;
            return this.inorder.get(index).val; 
        
      
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * boolean param_1 = obj.hasNext();
 * int param_2 = obj.next();
 * boolean param_3 = obj.hasPrev();
 * int param_4 = obj.prev();
 */