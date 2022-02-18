class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        int p=0;
        int q = height.length-1;
        
        while(p != q){
            int currArea = Math.min(height[p], height[q])*(q-p);
            
            maxArea = Math.max(currArea, maxArea);
            
            if( height[p] < height[q]){
                p++;
            }
            else{
                q--;
            }
        }
        
        return maxArea;
    }
}