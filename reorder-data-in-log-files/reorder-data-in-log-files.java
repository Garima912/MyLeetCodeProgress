class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Comparator <String> comp = new Comparator<String>() {
            
            public int compare(String logA, String logB){
                String[] logA_split = logA.split(" ",2);
                String[] logB_split = logB.split(" ",2);
                
                //check if logs are digit or letter type
                Boolean logA_digit = Character.isDigit(logA_split[1].charAt(0));
                Boolean logB_digit = Character.isDigit(logB_split[1].charAt(0));
                
                if(logA_digit && !logB_digit){
                    return 1;
                    
                }
                if(!logA_digit && logB_digit){
                    return -1;
                }
                if(!logA_digit && !logB_digit){
                    
                    int sameWords = logA_split[1].compareTo(logB_split[1]);
                    if(sameWords == 0){
                        return logA_split[0].compareTo(logB_split[0]);
                    }
                    return sameWords;
                    
                }
                else{  //both digits
                    return 0;
                }
                
            }
        };
        
        Arrays.sort(logs, comp);
        return logs;
        
    }
}