class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        //base cases
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length > 1){
          memo[0] = nums[0];
          memo[1] = nums[1];  
        }
        
        for(int i = 2; i < nums.length; i++){
            if(i/2 != 0 && i > 2){  //even number of houses
                memo[i] = Math.max(memo[i-2] +nums[i], memo[i-3] + nums[i]);
            }else{   //odd number of houses
               memo[i] = memo[i-2] + nums[i]; 
            }
            
        }
        // for(int i: memo){
        //     System.out.println(i+" ");
        // }
        return Math.max(memo[nums.length -1], memo[nums.length-2]);
        
    }
}