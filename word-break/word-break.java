class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       return  wordMatch(s,new HashSet<String>(wordDict), 0, new Boolean[s.length()]);
        
    }
    
    private boolean wordMatch(String s, HashSet<String> wordDict, int start, Boolean[] memo){
        if(start == s.length()){
            return true;
        }
        if(memo[start] != null){
            return memo[start];
        }
        else{
            for(int end = start +1; end <= s.length() ; end++){
                if(wordDict.contains(s.substring(start,end)) && wordMatch(s , wordDict, end, memo)){
                    return memo[start] = true;
                }
        
            }
            return memo[start] = false;
        }
    }
}