class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int p =num1.length()-1, q = num2.length()-1;
        int carry =0;
        int digit =0;
        
        while(p >=0 || q >=0){
            int a = p>=0 ?Character.getNumericValue(num1.charAt(p)):0;
            int b = q>=0? Character.getNumericValue(num2.charAt(q)):0;
            int sum = carry + a +b;
            digit = sum%10;
            carry = sum/10;
            result = digit + result;
            p--;
            q--;
        }
        if(carry > 0){
            result = "1" + result;
        }
        
        return result;
        
        
    }
}