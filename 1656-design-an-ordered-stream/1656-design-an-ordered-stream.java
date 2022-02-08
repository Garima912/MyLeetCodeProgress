class OrderedStream {
    
    public String[] list;
    public int p;

    public OrderedStream(int n) {
        list = new String[n];
        p = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        
        ArrayList<String> values = new ArrayList<>();
        this.list[idKey -1] = value;
        
        for(int i = p; i< this.list.length; i++){
            if(list[i] == null){
                break;
            }

            if(list[i] != null){
                values.add(list[i]);
                this.p++;
            }
            
        }
        return values;
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */