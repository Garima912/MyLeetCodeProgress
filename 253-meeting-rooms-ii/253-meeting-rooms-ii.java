class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        Integer[] startTimes = new Integer[intervals.length];
        Integer[] endTimes = new Integer[intervals.length];
        
        for(int i= 0; i< intervals.length; i++){
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
        
        //sort arrays
        Arrays.sort(startTimes,
                    new Comparator<Integer>(){
                        public int compare(Integer x, Integer y){
                            return x-y;
                        }
                    }
                   );
        
        Arrays.sort(endTimes,
                    new Comparator<Integer>(){
                        public int compare(Integer x, Integer y){
                            return x-y;
                        }
                    }
                   );
        
        int sPtr = 0, ePtr = 0;
        int rooms = 0;
        
        while(sPtr < startTimes.length){
            if(startTimes[sPtr] < endTimes[ePtr]){
                rooms++;
                sPtr++;
            }
            else{
                sPtr++;
                ePtr++;
            }
        }
        
        return rooms;
        
    }
}