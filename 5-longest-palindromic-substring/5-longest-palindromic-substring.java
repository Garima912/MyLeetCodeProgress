class Solution {
    public String longestPalindrome(String s) {
        
         if(s.length() <  1 || s.equals("")){
             return "";
         } 
        boolean [][] memo = new boolean[s.length()][s.length()];
        int maxLength = Integer.MIN_VALUE;
        String result = "";
        
        for(int end = 0; end < s.length(); end ++){
            
            for(int start = 0; start <= end; start++){
                boolean same = (s.charAt(start) == s.charAt(end));
                
                
                if(end - start <= 2){
                    memo[start][end] = same;
                }
                else{
                    memo[start][end] = (same && memo[start+1][end -1]);
                    
                }
                
                if(memo[start][end] && maxLength < end -start +1 ){
                    maxLength = end - start +1;
                    result = s.substring(start, end+1);
                }
                
            }
        }
        
        return result;
        
        
    }
}