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
    
    public Stack <TreeNode> inorderStack;
    
    public BSTIterator(TreeNode root) {
      
        this.inorderStack = new Stack();
        leftTraverse(root);
    }
    
    private void leftTraverse(TreeNode root){
        while(root !=null){
            this.inorderStack.push(root);
            root = root.left;
        }
        
    }
    
    public int next() {
        
        TreeNode nextNode = this.inorderStack.pop();
        
        if(nextNode.right != null){
            leftTraverse(nextNode.right);
        }
        
        return nextNode.val;
        
    }
    
    public boolean hasNext() {
        if(this.inorderStack.size() > 0){
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */