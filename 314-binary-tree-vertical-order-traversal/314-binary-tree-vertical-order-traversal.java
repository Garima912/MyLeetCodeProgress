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
    
    class Node{
        TreeNode root;
        int column;
        Node(TreeNode root, int column){
            this.root = root;
            this.column = column;
        }
    }
    
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int minCol = Integer.MAX_VALUE;;
        int maxCol = Integer.MIN_VALUE;
        
        if(root == null) return result;
        
        Queue<Node> q = new LinkedList<>();
        Node rootNode = new Node(root,0);
        q.add(rootNode);
        
        while(!q.isEmpty()){
            Node node = q.poll();
            map.putIfAbsent(node.column, new ArrayList<Integer>());
            map.get(node.column).add(node.root.val);
            
            minCol = Math.min(minCol, node.column);
            maxCol = Math.max(maxCol, node.column);
            
            if(node.root.left != null){
                q.add(new Node(node.root.left, node.column -1));
                
            }
            if(node.root.right != null){
                q.add(new Node(node.root.right, node.column + 1));
            }
            
        }
        
        for(int i = minCol; i<= maxCol; i++){
            result.add(map.get(i));
        }
        
        return result;
        
    }
}