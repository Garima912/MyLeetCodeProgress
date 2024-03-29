/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int pivot = 0;
        
        while(start < end){
            pivot = start + (end - start)/2;
            if(isBadVersion(pivot)){
                end = pivot;
            }
            else{
                start = pivot + 1;
            }
        }
        return start;
        
    }
}