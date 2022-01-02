class Logger {
    
    public HashMap <String, Integer> dict;
    
    public Logger() {
        dict = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(dict.containsKey(message) == false){
            dict.put(message,timestamp);
            return true;
        }
        else{
            int oldTime = dict.get(message);
            if(timestamp - oldTime >= 10){
                dict.put(message, timestamp);
                return true;
            }
            
        }
        return false;
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */