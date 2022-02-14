class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> dict = new HashSet<>();
    
        while(n != 1 && !dict.contains(n)){
            dict.add(n);
            n = nextNum(n); 
        }
        
        return n == 1? true: false;
    }
    
    public int nextNum(int n){
        int sum = 0;
        
        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        n = sum;
        return n;
    }
}