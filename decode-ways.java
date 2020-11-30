class Solution {
    
    HashMap <Integer, Integer> previousData =  new HashMap<>();
    
    public int recurseString(String s, int index){
        
      if(index == s.length()){
            return 1;
        }
         
       if(s.charAt(index) == '0'){
                return 0;
            }
        //base case
        if(index == s.length() - 1){
            return 1;
        }
       
        if(previousData.containsKey(index)){
                return previousData.get(index);
            }
        
        // rec case        
        else{  
            int ways = recurseString(s, index+1);
            if(Integer.valueOf(s.substring(index, index+2)) > 0 && Integer.valueOf(s.substring(index, index+2)) < 27) {
                ways += recurseString(s, index+2);
            }
            previousData.put(index, ways);
            return ways;
        
        }
           
    }
    
    public int numDecodings(String s) {
        if(s == null || s.length() < 1){
            return 0;
        }
      
          return recurseString(s,0);
    }
}
