class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int start = 0;
        int end = nums.length - 1 ;
        
        while(start <= end){
            pivot = start + (end- start)/2;
            if ( nums[pivot] == target){
                return pivot;
            }
            if(nums[pivot] > target){
                end = pivot - 1;
            }
            else{
                start = pivot + 1;
            }
        }
        
        return -1;
    }
}