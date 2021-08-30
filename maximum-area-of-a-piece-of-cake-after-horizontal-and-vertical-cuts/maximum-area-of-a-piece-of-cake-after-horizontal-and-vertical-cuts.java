class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long maxH = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length-1] );
        long maxW = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length-1] );
        int diff = 0;
        
        for(int i=0; i< horizontalCuts.length;i++){
            
            if(i == horizontalCuts.length -1 ){
                diff = h - horizontalCuts[i];
            }
            else{
                diff = horizontalCuts[i+1]- horizontalCuts[i];
            }
            if(diff > maxH){maxH = diff;}
            
        }
        for(int i=0; i< verticalCuts.length;i++){
            
            if(i == verticalCuts.length -1 ){
                diff = w - verticalCuts[i];
            }
            else{
                diff = verticalCuts[i+1]- verticalCuts[i];
            }
            if(diff > maxW){maxW = diff;}
            
        }
        
        return  (int) ((maxW * maxH) % (1000000007));
    }
}