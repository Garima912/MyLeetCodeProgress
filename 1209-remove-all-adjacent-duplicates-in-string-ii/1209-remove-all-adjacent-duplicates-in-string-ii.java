class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder result = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        int count =1;
        
        
        for(int i =0; i< result.length(); i++){
            
            if(i == 0 || result.charAt(i) != result.charAt(i-1)){
                count = 1;
                stack.push(count);
                continue;
            }
            else{
                count = stack.pop()+1;
                stack.push(count);
                
                if(stack.peek() == k){
                    result.delete(i-k+1, i+1);
                    i = i-k;
                    stack.pop();
                }
            }
            
        }
        return result.toString();
    }
}