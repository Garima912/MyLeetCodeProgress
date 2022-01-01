class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        int p1 = 0;
        int p2 = height.length - 1;
        
       while(p1 < p2){
           
           int shorterHeight = Math.min(height[p1], height[p2]);
           maxArea  = Math.max(maxArea, shorterHeight*(p2-p1));
           
           if(height[p1] < height[p2]){
               p1++;
           }
           else{
               p2--;
           }
       }
        return maxArea;
    }
}