class Solution {
    public int[][] merge(int[][] intervals) {
      
        LinkedList<int[]> merged = new LinkedList<>();
      
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        for(int[] interval:intervals){
            int start = interval[0];
            int end = interval[1];
            
            if(merged.isEmpty() || merged.getLast()[1] < start){
                int[] arr = {start,end};
                merged.add(arr);
            }
            else{
                merged.getLast()[1] = Math.max(end,merged.getLast()[1] );
            }
            
        }
        return merged.toArray(new int [merged.size()][]);
               
    }
}