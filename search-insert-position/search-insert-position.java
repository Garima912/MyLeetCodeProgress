class Solution {
    public int searchInsert(int[] nums, int target) {
        int pivot , start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            pivot = start + (end - start)/2;
            if(target == nums[pivot]){
                return pivot;
            }
            else{
                if(target < nums[pivot]){
                    end = pivot - 1;
                }
                if(target > nums[pivot]){
                    start = pivot + 1;
                }
            }
        }
        return start;
    }
}