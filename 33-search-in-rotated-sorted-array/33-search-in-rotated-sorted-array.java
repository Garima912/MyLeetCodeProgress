class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length -1;
        
        int pivot=0;
        
        while(start <= end){
            pivot = start + (end-start)/2;
            
            if(nums[pivot] == target){
                return pivot;
            }
            if(nums[pivot] >= nums[start]){ //first half is sorted 
                if(target>= nums[start] && target < nums[pivot]) end = pivot -1;
                else{
                    start = pivot+1;
                }
            }
            else{   //first half is not sorted
                if(target <= nums[end] && target > nums[pivot]) start = pivot+1;
                else{
                    end = pivot -1;
                }
            }
        }
        return -1;
    }
}