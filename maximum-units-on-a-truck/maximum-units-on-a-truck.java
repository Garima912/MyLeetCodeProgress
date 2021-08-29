class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int sizeLeft = truckSize;
        int boxCount =0;
        int units = 0;
        
        Comparator<int[]> comp = new Comparator<int[]>(){
            
            public int compare(int[] type1, int[] type2){
                if(type1[1]> type2[1]){
                    return -1;
                }
                if(type1[1]< type2[1]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            
        };
        Arrays.sort(boxTypes,comp);
        
        for(int[] boxType: boxTypes){
            
            boxCount = Math.min(sizeLeft, boxType[0]);
            sizeLeft -= boxCount;
            units += boxCount*boxType[1];   
        }
        
        return units;
    }
}