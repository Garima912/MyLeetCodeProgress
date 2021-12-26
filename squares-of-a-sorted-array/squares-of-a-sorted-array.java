class Solution {
    public int[] sortedSquares(int[] nums) {
    
        int left =0;
        int right = nums.length -1;
        int[] sortedSquares= new int[nums.length];
        
        for (int i= nums.length -1; i>= 0; i--){
            int value ;
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                value = nums[left];
                left++;
            }
            else{
                value = nums[right];
                right--;
            }
            value *= value;
            sortedSquares[i] = value;
        }
        return sortedSquares;
        
    }
}